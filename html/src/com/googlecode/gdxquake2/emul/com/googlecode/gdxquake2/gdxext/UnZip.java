package com.googlecode.gdxquake2.gdxext;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.BufferUtils;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.typedarrays.shared.Uint8Array;
import com.googlecode.gdxquake2.GdxQuake2;

import java.nio.ByteBuffer;
import java.nio.HasArrayBufferView;


public class UnZip implements Runnable {

    private final String url;
    private final Callback<ZipEntry> dataCallback;
    private final Callback<Void> doneCallback;
    private JsArray zipEntries;
    private int zipIndex;

    // Hack to avoid JSNI ultra-long parameter specification for
    private String currentName;
    private ByteBuffer currentBuffer;

    public UnZip(String url, Callback<ZipEntry> dataCallback, Callback<Void> doneCallback) {
        this.url = url;
        this.dataCallback = dataCallback;
        this.doneCallback = doneCallback;
    }

    public void run() {
        if (zipEntries == null) {
            request(url);
        } else if (zipIndex < zipEntries.length()) {
            processEntry(zipEntries.get(zipIndex++));
        } else {
            doneCallback.onSuccess(null);
        }
    }

    private void postSelf() {
        Gdx.app.postRunnable(this);
    }

    private native void processEntry(JavaScriptObject zipEntry) /*-{
      var zip = $wnd.zip;
      var self = this;

      var fileName = zipEntry.filename;
      if (zipEntry.directory) {
        self.@com.googlecode.gdxquake2.gdxext.UnZip::postSelf()();
        return;
      }

      var ArrayWriter = function(data) {
        this.data = data;
        this.pos = 0;
      };
      ArrayWriter.prototype.init = function(callback) {
        callback();
      };
      ArrayWriter.prototype.writeUint8Array = function(array, callback) {
        this.data.set(array, this.pos);
        this.pos += array.length;
        callback();
      };
      ArrayWriter.prototype.getData = function(callback) {
        callback(this.data);
      }

      var array = self.@com.googlecode.gdxquake2.gdxext.UnZip::createBuffer(I)(zipEntry.uncompressedSize);

      zipEntry.getData(new ArrayWriter(array),
        function(array) {
          self.@com.googlecode.gdxquake2.gdxext.UnZip::currentName = fileName;
          self.@com.googlecode.gdxquake2.gdxext.UnZip::entryAvailable()();
        },
        function(current, total) {
        }
      );
    }-*/;

    private Uint8Array createBuffer(int size) {
        GdxQuake2.tools.log("createbuffer " + size);
        currentBuffer = BufferUtils.newByteBuffer(size);
        return (Uint8Array) ((HasArrayBufferView) currentBuffer).getTypedArray();
    }

    private void entryAvailable() {
        GdxQuake2.tools.log("entryAvailable " + currentName + "; calling onsuccess");
        dataCallback.onSuccess(new ZipEntry(currentName, currentBuffer));
        GdxQuake2.tools.log("back from onSuccess");
        currentName = null;
        currentBuffer = null;
        postSelf();
    }

    private native void request(String url) /*-{
      var zip = $wnd.zip;
      var self = this;
      zip.createReader(new zip.HttpReader(url), function(reader) {
        reader.getEntries(function(zipEntries) {
          self.@com.googlecode.gdxquake2.gdxext.UnZip::zipEntries = zipEntries;
          self.@com.googlecode.gdxquake2.gdxext.UnZip::postSelf()();
        }); // getEntries
      }, function(msg) {
        // TODO: done error callback
        $wnd.console.log("Creating a ZIP reader failed: " + msg);
      });
    }-*/;
}