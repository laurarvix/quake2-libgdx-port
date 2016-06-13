/*
 * Copyright (C) 1997-2001 Id Software, Inc.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 *  
 */
/* Modifications
   Copyright 2003-2004 Bytonic Software
   Copyright 2010 Google Inc.
*/
package com.googlecode.gdxquake2.game.game.monsters;

import com.googlecode.gdxquake2.game.common.Constants;
import com.googlecode.gdxquake2.game.game.*;
import com.googlecode.gdxquake2.game.game.adapters.EntInteractAdapter;
import com.googlecode.gdxquake2.game.game.adapters.EntityDieAdapter;
import com.googlecode.gdxquake2.game.game.adapters.EntityDodgeAdapter;
import com.googlecode.gdxquake2.game.game.adapters.EntityPainAdapter;
import com.googlecode.gdxquake2.game.game.adapters.EntityThinkAdapter;
import com.googlecode.gdxquake2.game.server.ServerGame;
import com.googlecode.gdxquake2.game.server.ServerInit;
import com.googlecode.gdxquake2.game.server.World;
import com.googlecode.gdxquake2.game.util.Lib;
import com.googlecode.gdxquake2.game.util.Math3D;


public class MonsterChick {

    public final static int FRAME_attak101 = 0;

    public final static int FRAME_attak102 = 1;

    public final static int FRAME_attak103 = 2;

    public final static int FRAME_attak104 = 3;

    public final static int FRAME_attak105 = 4;

    public final static int FRAME_attak106 = 5;

    public final static int FRAME_attak107 = 6;

    public final static int FRAME_attak108 = 7;

    public final static int FRAME_attak109 = 8;

    public final static int FRAME_attak110 = 9;

    public final static int FRAME_attak111 = 10;

    public final static int FRAME_attak112 = 11;

    public final static int FRAME_attak113 = 12;

    public final static int FRAME_attak114 = 13;

    public final static int FRAME_attak115 = 14;

    public final static int FRAME_attak116 = 15;

    public final static int FRAME_attak117 = 16;

    public final static int FRAME_attak118 = 17;

    public final static int FRAME_attak119 = 18;

    public final static int FRAME_attak120 = 19;

    public final static int FRAME_attak121 = 20;

    public final static int FRAME_attak122 = 21;

    public final static int FRAME_attak123 = 22;

    public final static int FRAME_attak124 = 23;

    public final static int FRAME_attak125 = 24;

    public final static int FRAME_attak126 = 25;

    public final static int FRAME_attak127 = 26;

    public final static int FRAME_attak128 = 27;

    public final static int FRAME_attak129 = 28;

    public final static int FRAME_attak130 = 29;

    public final static int FRAME_attak131 = 30;

    public final static int FRAME_attak132 = 31;

    public final static int FRAME_attak201 = 32;

    public final static int FRAME_attak202 = 33;

    public final static int FRAME_attak203 = 34;

    public final static int FRAME_attak204 = 35;

    public final static int FRAME_attak205 = 36;

    public final static int FRAME_attak206 = 37;

    public final static int FRAME_attak207 = 38;

    public final static int FRAME_attak208 = 39;

    public final static int FRAME_attak209 = 40;

    public final static int FRAME_attak210 = 41;

    public final static int FRAME_attak211 = 42;

    public final static int FRAME_attak212 = 43;

    public final static int FRAME_attak213 = 44;

    public final static int FRAME_attak214 = 45;

    public final static int FRAME_attak215 = 46;

    public final static int FRAME_attak216 = 47;

    public final static int FRAME_death101 = 48;

    public final static int FRAME_death102 = 49;

    public final static int FRAME_death103 = 50;

    public final static int FRAME_death104 = 51;

    public final static int FRAME_death105 = 52;

    public final static int FRAME_death106 = 53;

    public final static int FRAME_death107 = 54;

    public final static int FRAME_death108 = 55;

    public final static int FRAME_death109 = 56;

    public final static int FRAME_death110 = 57;

    public final static int FRAME_death111 = 58;

    public final static int FRAME_death112 = 59;

    public final static int FRAME_death201 = 60;

    public final static int FRAME_death202 = 61;

    public final static int FRAME_death203 = 62;

    public final static int FRAME_death204 = 63;

    public final static int FRAME_death205 = 64;

    public final static int FRAME_death206 = 65;

    public final static int FRAME_death207 = 66;

    public final static int FRAME_death208 = 67;

    public final static int FRAME_death209 = 68;

    public final static int FRAME_death210 = 69;

    public final static int FRAME_death211 = 70;

    public final static int FRAME_death212 = 71;

    public final static int FRAME_death213 = 72;

    public final static int FRAME_death214 = 73;

    public final static int FRAME_death215 = 74;

    public final static int FRAME_death216 = 75;

    public final static int FRAME_death217 = 76;

    public final static int FRAME_death218 = 77;

    public final static int FRAME_death219 = 78;

    public final static int FRAME_death220 = 79;

    public final static int FRAME_death221 = 80;

    public final static int FRAME_death222 = 81;

    public final static int FRAME_death223 = 82;

    public final static int FRAME_duck01 = 83;

    public final static int FRAME_duck02 = 84;

    public final static int FRAME_duck03 = 85;

    public final static int FRAME_duck04 = 86;

    public final static int FRAME_duck05 = 87;

    public final static int FRAME_duck06 = 88;

    public final static int FRAME_duck07 = 89;

    public final static int FRAME_pain101 = 90;

    public final static int FRAME_pain102 = 91;

    public final static int FRAME_pain103 = 92;

    public final static int FRAME_pain104 = 93;

    public final static int FRAME_pain105 = 94;

    public final static int FRAME_pain201 = 95;

    public final static int FRAME_pain202 = 96;

    public final static int FRAME_pain203 = 97;

    public final static int FRAME_pain204 = 98;

    public final static int FRAME_pain205 = 99;

    public final static int FRAME_pain301 = 100;

    public final static int FRAME_pain302 = 101;

    public final static int FRAME_pain303 = 102;

    public final static int FRAME_pain304 = 103;

    public final static int FRAME_pain305 = 104;

    public final static int FRAME_pain306 = 105;

    public final static int FRAME_pain307 = 106;

    public final static int FRAME_pain308 = 107;

    public final static int FRAME_pain309 = 108;

    public final static int FRAME_pain310 = 109;

    public final static int FRAME_pain311 = 110;

    public final static int FRAME_pain312 = 111;

    public final static int FRAME_pain313 = 112;

    public final static int FRAME_pain314 = 113;

    public final static int FRAME_pain315 = 114;

    public final static int FRAME_pain316 = 115;

    public final static int FRAME_pain317 = 116;

    public final static int FRAME_pain318 = 117;

    public final static int FRAME_pain319 = 118;

    public final static int FRAME_pain320 = 119;

    public final static int FRAME_pain321 = 120;

    public final static int FRAME_stand101 = 121;

    public final static int FRAME_stand102 = 122;

    public final static int FRAME_stand103 = 123;

    public final static int FRAME_stand104 = 124;

    public final static int FRAME_stand105 = 125;

    public final static int FRAME_stand106 = 126;

    public final static int FRAME_stand107 = 127;

    public final static int FRAME_stand108 = 128;

    public final static int FRAME_stand109 = 129;

    public final static int FRAME_stand110 = 130;

    public final static int FRAME_stand111 = 131;

    public final static int FRAME_stand112 = 132;

    public final static int FRAME_stand113 = 133;

    public final static int FRAME_stand114 = 134;

    public final static int FRAME_stand115 = 135;

    public final static int FRAME_stand116 = 136;

    public final static int FRAME_stand117 = 137;

    public final static int FRAME_stand118 = 138;

    public final static int FRAME_stand119 = 139;

    public final static int FRAME_stand120 = 140;

    public final static int FRAME_stand121 = 141;

    public final static int FRAME_stand122 = 142;

    public final static int FRAME_stand123 = 143;

    public final static int FRAME_stand124 = 144;

    public final static int FRAME_stand125 = 145;

    public final static int FRAME_stand126 = 146;

    public final static int FRAME_stand127 = 147;

    public final static int FRAME_stand128 = 148;

    public final static int FRAME_stand129 = 149;

    public final static int FRAME_stand130 = 150;

    public final static int FRAME_stand201 = 151;

    public final static int FRAME_stand202 = 152;

    public final static int FRAME_stand203 = 153;

    public final static int FRAME_stand204 = 154;

    public final static int FRAME_stand205 = 155;

    public final static int FRAME_stand206 = 156;

    public final static int FRAME_stand207 = 157;

    public final static int FRAME_stand208 = 158;

    public final static int FRAME_stand209 = 159;

    public final static int FRAME_stand210 = 160;

    public final static int FRAME_stand211 = 161;

    public final static int FRAME_stand212 = 162;

    public final static int FRAME_stand213 = 163;

    public final static int FRAME_stand214 = 164;

    public final static int FRAME_stand215 = 165;

    public final static int FRAME_stand216 = 166;

    public final static int FRAME_stand217 = 167;

    public final static int FRAME_stand218 = 168;

    public final static int FRAME_stand219 = 169;

    public final static int FRAME_stand220 = 170;

    public final static int FRAME_stand221 = 171;

    public final static int FRAME_stand222 = 172;

    public final static int FRAME_stand223 = 173;

    public final static int FRAME_stand224 = 174;

    public final static int FRAME_stand225 = 175;

    public final static int FRAME_stand226 = 176;

    public final static int FRAME_stand227 = 177;

    public final static int FRAME_stand228 = 178;

    public final static int FRAME_stand229 = 179;

    public final static int FRAME_stand230 = 180;

    public final static int FRAME_walk01 = 181;

    public final static int FRAME_walk02 = 182;

    public final static int FRAME_walk03 = 183;

    public final static int FRAME_walk04 = 184;

    public final static int FRAME_walk05 = 185;

    public final static int FRAME_walk06 = 186;

    public final static int FRAME_walk07 = 187;

    public final static int FRAME_walk08 = 188;

    public final static int FRAME_walk09 = 189;

    public final static int FRAME_walk10 = 190;

    public final static int FRAME_walk11 = 191;

    public final static int FRAME_walk12 = 192;

    public final static int FRAME_walk13 = 193;

    public final static int FRAME_walk14 = 194;

    public final static int FRAME_walk15 = 195;

    public final static int FRAME_walk16 = 196;

    public final static int FRAME_walk17 = 197;

    public final static int FRAME_walk18 = 198;

    public final static int FRAME_walk19 = 199;

    public final static int FRAME_walk20 = 200;

    public final static int FRAME_walk21 = 201;

    public final static int FRAME_walk22 = 202;

    public final static int FRAME_walk23 = 203;

    public final static int FRAME_walk24 = 204;

    public final static int FRAME_walk25 = 205;

    public final static int FRAME_walk26 = 206;

    public final static int FRAME_walk27 = 207;

    public final static int FRAME_recln201 = 208;

    public final static int FRAME_recln202 = 209;

    public final static int FRAME_recln203 = 210;

    public final static int FRAME_recln204 = 211;

    public final static int FRAME_recln205 = 212;

    public final static int FRAME_recln206 = 213;

    public final static int FRAME_recln207 = 214;

    public final static int FRAME_recln208 = 215;

    public final static int FRAME_recln209 = 216;

    public final static int FRAME_recln210 = 217;

    public final static int FRAME_recln211 = 218;

    public final static int FRAME_recln212 = 219;

    public final static int FRAME_recln213 = 220;

    public final static int FRAME_recln214 = 221;

    public final static int FRAME_recln215 = 222;

    public final static int FRAME_recln216 = 223;

    public final static int FRAME_recln217 = 224;

    public final static int FRAME_recln218 = 225;

    public final static int FRAME_recln219 = 226;

    public final static int FRAME_recln220 = 227;

    public final static int FRAME_recln221 = 228;

    public final static int FRAME_recln222 = 229;

    public final static int FRAME_recln223 = 230;

    public final static int FRAME_recln224 = 231;

    public final static int FRAME_recln225 = 232;

    public final static int FRAME_recln226 = 233;

    public final static int FRAME_recln227 = 234;

    public final static int FRAME_recln228 = 235;

    public final static int FRAME_recln229 = 236;

    public final static int FRAME_recln230 = 237;

    public final static int FRAME_recln231 = 238;

    public final static int FRAME_recln232 = 239;

    public final static int FRAME_recln233 = 240;

    public final static int FRAME_recln234 = 241;

    public final static int FRAME_recln235 = 242;

    public final static int FRAME_recln236 = 243;

    public final static int FRAME_recln237 = 244;

    public final static int FRAME_recln238 = 245;

    public final static int FRAME_recln239 = 246;

    public final static int FRAME_recln240 = 247;

    public final static int FRAME_recln101 = 248;

    public final static int FRAME_recln102 = 249;

    public final static int FRAME_recln103 = 250;

    public final static int FRAME_recln104 = 251;

    public final static int FRAME_recln105 = 252;

    public final static int FRAME_recln106 = 253;

    public final static int FRAME_recln107 = 254;

    public final static int FRAME_recln108 = 255;

    public final static int FRAME_recln109 = 256;

    public final static int FRAME_recln110 = 257;

    public final static int FRAME_recln111 = 258;

    public final static int FRAME_recln112 = 259;

    public final static int FRAME_recln113 = 260;

    public final static int FRAME_recln114 = 261;

    public final static int FRAME_recln115 = 262;

    public final static int FRAME_recln116 = 263;

    public final static int FRAME_recln117 = 264;

    public final static int FRAME_recln118 = 265;

    public final static int FRAME_recln119 = 266;

    public final static int FRAME_recln120 = 267;

    public final static int FRAME_recln121 = 268;

    public final static int FRAME_recln122 = 269;

    public final static int FRAME_recln123 = 270;

    public final static int FRAME_recln124 = 271;

    public final static int FRAME_recln125 = 272;

    public final static int FRAME_recln126 = 273;

    public final static int FRAME_recln127 = 274;

    public final static int FRAME_recln128 = 275;

    public final static int FRAME_recln129 = 276;

    public final static int FRAME_recln130 = 277;

    public final static int FRAME_recln131 = 278;

    public final static int FRAME_recln132 = 279;

    public final static int FRAME_recln133 = 280;

    public final static int FRAME_recln134 = 281;

    public final static int FRAME_recln135 = 282;

    public final static int FRAME_recln136 = 283;

    public final static int FRAME_recln137 = 284;

    public final static int FRAME_recln138 = 285;

    public final static int FRAME_recln139 = 286;

    public final static int FRAME_recln140 = 287;

    public final static float MODEL_SCALE = 1.000000f;

    static int sound_missile_prelaunch;

    static int sound_missile_launch;

    static int sound_melee_swing;

    static int sound_melee_hit;

    static int sound_missile_reload;

    static int sound_death1;

    static int sound_death2;

    static int sound_fall_down;

    static int sound_idle1;

    static int sound_idle2;

    static int sound_pain1;

    static int sound_pain2;

    static int sound_pain3;

    static int sound_sight;

    static int sound_search;

    static EntityThinkAdapter ChickMoan = new EntityThinkAdapter() {
    	public String getID() { return "ChickMoan"; }
        public boolean think(Entity self) {
            if (Lib.random() < 0.5)
              ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_idle1, (float) 1, (float) Constants.ATTN_IDLE,
              (float) 0);
            else
              ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_idle2, (float) 1, (float) Constants.ATTN_IDLE,
              (float) 0);
            return true;
        }
    };

    static Frame chick_frames_fidget[] = new Frame[] {
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, ChickMoan),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null) };

    static EntityThinkAdapter chick_stand = new EntityThinkAdapter() {
    	public String getID() { return "chick_stand"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = chick_move_stand;
            return true;
        }
    };

    static MonsterMove chick_move_fidget = new MonsterMove(FRAME_stand201,
            FRAME_stand230, chick_frames_fidget, chick_stand);

    static EntityThinkAdapter chick_fidget = new EntityThinkAdapter() {
    	public String getID() { return "chick_fidget"; }
        public boolean think(Entity self) {
            if ((self.monsterinfo.aiflags & Constants.AI_STAND_GROUND) != 0)
                return true;
            if (Lib.random() <= 0.3)
                self.monsterinfo.currentmove = chick_move_fidget;
            return true;
        }
    };

    static Frame chick_frames_stand[] = new Frame[] {
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, chick_fidget), };

    static MonsterMove chick_move_stand = new MonsterMove(FRAME_stand101,
            FRAME_stand130, chick_frames_stand, null);

    static EntityThinkAdapter chick_run = new EntityThinkAdapter() {
    	public String getID() { return "chick_run"; }
        public boolean think(Entity self) {
            if ((self.monsterinfo.aiflags & Constants.AI_STAND_GROUND) != 0) {
                self.monsterinfo.currentmove = chick_move_stand;
                return true;
            }

            if (self.monsterinfo.currentmove == chick_move_walk
                    || self.monsterinfo.currentmove == chick_move_start_run) {
                self.monsterinfo.currentmove = chick_move_run;
            } else {
                self.monsterinfo.currentmove = chick_move_start_run;
            }
            return true;
        }
    };

    static Frame chick_frames_start_run[] = new Frame[] {
            new Frame(GameAI.ai_run, 1, null),
            new Frame(GameAI.ai_run, 0, null),
            new Frame(GameAI.ai_run, 0, null),
            new Frame(GameAI.ai_run, -1, null),
            new Frame(GameAI.ai_run, -1, null),
            new Frame(GameAI.ai_run, 0, null),
            new Frame(GameAI.ai_run, 1, null),
            new Frame(GameAI.ai_run, 3, null),
            new Frame(GameAI.ai_run, 6, null),
            new Frame(GameAI.ai_run, 3, null) };

    static MonsterMove chick_move_start_run = new MonsterMove(FRAME_walk01,
            FRAME_walk10, chick_frames_start_run, chick_run);

    static Frame chick_frames_run[] = new Frame[] {
            new Frame(GameAI.ai_run, 6, null),
            new Frame(GameAI.ai_run, 8, null),
            new Frame(GameAI.ai_run, 13, null),
            new Frame(GameAI.ai_run, 5, null),
            new Frame(GameAI.ai_run, 7, null),
            new Frame(GameAI.ai_run, 4, null),
            new Frame(GameAI.ai_run, 11, null),
            new Frame(GameAI.ai_run, 5, null),
            new Frame(GameAI.ai_run, 9, null),
            new Frame(GameAI.ai_run, 7, null) };

    static MonsterMove chick_move_run = new MonsterMove(FRAME_walk11, FRAME_walk20,
            chick_frames_run, null);

    static Frame chick_frames_walk[] = new Frame[] {
            new Frame(GameAI.ai_walk, 6, null),
            new Frame(GameAI.ai_walk, 8, null),
            new Frame(GameAI.ai_walk, 13, null),
            new Frame(GameAI.ai_walk, 5, null),
            new Frame(GameAI.ai_walk, 7, null),
            new Frame(GameAI.ai_walk, 4, null),
            new Frame(GameAI.ai_walk, 11, null),
            new Frame(GameAI.ai_walk, 5, null),
            new Frame(GameAI.ai_walk, 9, null),
            new Frame(GameAI.ai_walk, 7, null) };

    static MonsterMove chick_move_walk = new MonsterMove(FRAME_walk11, FRAME_walk20,
            chick_frames_walk, null);

    static EntityThinkAdapter chick_walk = new EntityThinkAdapter() {
    	public String getID() { return "chick_walk"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = chick_move_walk;
            return true;
        }
    };

    static Frame chick_frames_pain1[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null) };

    static MonsterMove chick_move_pain1 = new MonsterMove(FRAME_pain101, FRAME_pain105,
            chick_frames_pain1, chick_run);

    static Frame chick_frames_pain2[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null) };

    static MonsterMove chick_move_pain2 = new MonsterMove(FRAME_pain201, FRAME_pain205,
            chick_frames_pain2, chick_run);

    static Frame chick_frames_pain3[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, -6, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 11, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 4, null),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, -3, null),
            new Frame(GameAI.ai_move, -4, null),
            new Frame(GameAI.ai_move, 5, null),
            new Frame(GameAI.ai_move, 7, null),
            new Frame(GameAI.ai_move, -2, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, -5, null),
            new Frame(GameAI.ai_move, -2, null),
            new Frame(GameAI.ai_move, -8, null),
            new Frame(GameAI.ai_move, 2, null) };

    static MonsterMove chick_move_pain3 = new MonsterMove(FRAME_pain301, FRAME_pain321,
            chick_frames_pain3, chick_run);

    static EntityPainAdapter chick_pain = new EntityPainAdapter() {
    	public String getID() { return "chick_pain"; }
        public void pain(Entity self, Entity other, float kick, int damage) {
            float r;

            if (self.health < (self.max_health / 2))
                self.s.skinnum = 1;

            if (GameBase.level.time < self.pain_debounce_time)
                return;

            self.pain_debounce_time = GameBase.level.time + 3;

            r = Lib.random();
            if (r < 0.33)
              ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_pain1, (float) 1, (float) Constants.ATTN_NORM,
              (float) 0);
            else if (r < 0.66)
              ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_pain2, (float) 1, (float) Constants.ATTN_NORM,
              (float) 0);
            else
              ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_pain3, (float) 1, (float) Constants.ATTN_NORM,
              (float) 0);

            if (GameBase.skill.value == 3)
                return; // no pain anims in nightmare

            if (damage <= 10)
                self.monsterinfo.currentmove = chick_move_pain1;
            else if (damage <= 25)
                self.monsterinfo.currentmove = chick_move_pain2;
            else
                self.monsterinfo.currentmove = chick_move_pain3;
            return;
        }
    };

    static EntityThinkAdapter chick_dead = new EntityThinkAdapter() {
    	public String getID() { return "chick_dead"; }
        public boolean think(Entity self) {
            Math3D.VectorSet(self.mins, -16, -16, 0);
            Math3D.VectorSet(self.maxs, 16, 16, 16);
            self.movetype = Constants.MOVETYPE_TOSS;
            self.svflags |= Constants.SVF_DEADMONSTER;
            self.nextthink = 0;
            World.SV_LinkEdict(self);
            return true;
        }
    };

    static Frame chick_frames_death2[] = new Frame[] {
            new Frame(GameAI.ai_move, -6, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, -1, null),
            new Frame(GameAI.ai_move, -5, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, -1, null),
            new Frame(GameAI.ai_move, -2, null),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, 10, null),
            new Frame(GameAI.ai_move, 2, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, 2, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, -3, null),
            new Frame(GameAI.ai_move, -5, null),
            new Frame(GameAI.ai_move, 4, null),
            new Frame(GameAI.ai_move, 15, null),
            new Frame(GameAI.ai_move, 14, null),
            new Frame(GameAI.ai_move, 1, null) };

    static MonsterMove chick_move_death2 = new MonsterMove(FRAME_death201,
            FRAME_death223, chick_frames_death2, chick_dead);

    static Frame chick_frames_death1[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, -7, null),
            new Frame(GameAI.ai_move, 4, null),
            new Frame(GameAI.ai_move, 11, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null) };

    static MonsterMove chick_move_death1 = new MonsterMove(FRAME_death101,
            FRAME_death112, chick_frames_death1, chick_dead);

    static EntityDieAdapter chick_die = new EntityDieAdapter() {
    	public String getID() { return "chick_die"; }

        public void die(Entity self, Entity inflictor, Entity attacker,
                int damage, float[] point) {
            int n;

            //		   check for gib
            if (self.health <= self.gib_health) {
                ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, ServerInit.SV_SoundIndex("misc/udeath.wav"), (float) 1, (float) Constants.ATTN_NORM,
                (float) 0);
                for (n = 0; n < 2; n++)
                    GameMisc.ThrowGib(self, "models/objects/gibs/bone/tris.md2",
                            damage, Constants.GIB_ORGANIC);
                for (n = 0; n < 4; n++)
                    GameMisc.ThrowGib(self,
                            "models/objects/gibs/sm_meat/tris.md2", damage,
                            Constants.GIB_ORGANIC);
                GameMisc.ThrowHead(self, "models/objects/gibs/head2/tris.md2",
                        damage, Constants.GIB_ORGANIC);
                self.deadflag = Constants.DEAD_DEAD;
                return;
            }

            if (self.deadflag == Constants.DEAD_DEAD)
                return;

            //		   regular death
            self.deadflag = Constants.DEAD_DEAD;
            self.takedamage = Constants.DAMAGE_YES;

            n = Lib.rand() % 2;
            if (n == 0) {
                self.monsterinfo.currentmove = chick_move_death1;
                ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_death1, (float) 1, (float) Constants.ATTN_NORM,
                (float) 0);
            } else {
                self.monsterinfo.currentmove = chick_move_death2;
                ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_death2, (float) 1, (float) Constants.ATTN_NORM,
                (float) 0);
            }
        }

    };

    static EntityThinkAdapter chick_duck_down = new EntityThinkAdapter() {
    	public String getID() { return "chick_duck_down"; }
        public boolean think(Entity self) {
            if ((self.monsterinfo.aiflags & Constants.AI_DUCKED) != 0)
                return true;
            self.monsterinfo.aiflags |= Constants.AI_DUCKED;
            self.maxs[2] -= 32;
            self.takedamage = Constants.DAMAGE_YES;
            self.monsterinfo.pausetime = GameBase.level.time + 1;
            World.SV_LinkEdict(self);
            return true;
        }
    };

    static EntityThinkAdapter chick_duck_hold = new EntityThinkAdapter() {
    	public String getID() { return "chick_duck_hold"; }
        public boolean think(Entity self) {
            if (GameBase.level.time >= self.monsterinfo.pausetime)
                self.monsterinfo.aiflags &= ~Constants.AI_HOLD_FRAME;
            else
                self.monsterinfo.aiflags |= Constants.AI_HOLD_FRAME;
            return true;
        }
    };

    static EntityThinkAdapter chick_duck_up = new EntityThinkAdapter() {
    	public String getID() { return "chick_duck_up"; }
        public boolean think(Entity self) {
            self.monsterinfo.aiflags &= ~Constants.AI_DUCKED;
            self.maxs[2] += 32;
            self.takedamage = Constants.DAMAGE_AIM;
            World.SV_LinkEdict(self);
            return true;
        }
    };

    static Frame chick_frames_duck[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, chick_duck_down),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, 4, chick_duck_hold),
            new Frame(GameAI.ai_move, -4, null),
            new Frame(GameAI.ai_move, -5, chick_duck_up),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 1, null) };

    static MonsterMove chick_move_duck = new MonsterMove(FRAME_duck01, FRAME_duck07,
            chick_frames_duck, chick_run);

    static EntityDodgeAdapter chick_dodge = new EntityDodgeAdapter() {
    	public String getID() { return "chick_dodge"; }
        public void dodge(Entity self, Entity attacker, float eta) {
            if (Lib.random() > 0.25)
                return;

            if (self.enemy != null)
                self.enemy = attacker;

            self.monsterinfo.currentmove = chick_move_duck;
            return;
        }
    };

    static EntityThinkAdapter ChickSlash = new EntityThinkAdapter() {
    	public String getID() { return "ChickSlash"; }
        public boolean think(Entity self) {
            float[] aim = { 0, 0, 0 };

            Math3D.VectorSet(aim, Constants.MELEE_DISTANCE, self.mins[0], 10);
            ServerGame.PF_StartSound(self, Constants.CHAN_WEAPON, sound_melee_swing, (float) 1, (float) Constants.ATTN_NORM,
            (float) 0);
            GameWeapon.fire_hit(self, aim, (10 + (Lib.rand() % 6)), 100);
            return true;
        }
    };

    static EntityThinkAdapter ChickRocket = new EntityThinkAdapter() {
    	public String getID() { return "ChickRocket"; }
        public boolean think(Entity self) {
            float[] forward = { 0, 0, 0 }, right = { 0, 0, 0 };
            float[] start = { 0, 0, 0 };
            float[] dir = { 0, 0, 0 };
            float[] vec = { 0, 0, 0 };

            Math3D.AngleVectors(self.s.angles, forward, right, null);
            Math3D.G_ProjectSource(self.s.origin,
                    MonsterFlash.monster_flash_offset[Constants.MZ2_CHICK_ROCKET_1],
                    forward, right, start);

            Math3D.VectorCopy(self.enemy.s.origin, vec);
            vec[2] += self.enemy.viewheight;
            Math3D.VectorSubtract(vec, start, dir);
            Math3D.VectorNormalize(dir);

            Monster.monster_fire_rocket(self, start, dir, 50, 500,
                    Constants.MZ2_CHICK_ROCKET_1);
            return true;
        }
    };

    static EntityThinkAdapter Chick_PreAttack1 = new EntityThinkAdapter() {
    	public String getID() { return "Chick_PreAttack1"; }
        public boolean think(Entity self) {
            ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_missile_prelaunch, (float) 1, (float) Constants.ATTN_NORM,
            (float) 0);
            return true;
        }
    };

    static EntityThinkAdapter ChickReload = new EntityThinkAdapter() {
    	public String getID() { return "ChickReload"; }
        public boolean think(Entity self) {
            ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_missile_reload, (float) 1, (float) Constants.ATTN_NORM,
            (float) 0);
            return true;
        }
    };

    static EntityThinkAdapter chick_attack1 = new EntityThinkAdapter() {
    	public String getID() { return "chick_attack1"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = chick_move_attack1;
            return true;
        }
    };

    static EntityThinkAdapter chick_rerocket = new EntityThinkAdapter() {
    	public String getID() { return "chick_rerocket"; }
        public boolean think(Entity self) {
            if (self.enemy.health > 0) {
                if (GameUtil.range(self, self.enemy) > Constants.RANGE_MELEE)
                    if (GameUtil.visible(self, self.enemy))
                        if (Lib.random() <= 0.6) {
                            self.monsterinfo.currentmove = chick_move_attack1;
                            return true;
                        }
            }
            self.monsterinfo.currentmove = chick_move_end_attack1;
            return true;
        }
    };

    static Frame chick_frames_start_attack1[] = new Frame[] {
            new Frame(GameAI.ai_charge, 0, Chick_PreAttack1),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 4, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, -3, null),
            new Frame(GameAI.ai_charge, 3, null),
            new Frame(GameAI.ai_charge, 5, null),
            new Frame(GameAI.ai_charge, 7, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, chick_attack1) };

    static MonsterMove chick_move_start_attack1 = new MonsterMove(FRAME_attak101,
            FRAME_attak113, chick_frames_start_attack1, null);

    static Frame chick_frames_attack1[] = new Frame[] {
            new Frame(GameAI.ai_charge, 19, ChickRocket),
            new Frame(GameAI.ai_charge, -6, null),
            new Frame(GameAI.ai_charge, -5, null),
            new Frame(GameAI.ai_charge, -2, null),
            new Frame(GameAI.ai_charge, -7, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 1, null),
            new Frame(GameAI.ai_charge, 10, ChickReload),
            new Frame(GameAI.ai_charge, 4, null),
            new Frame(GameAI.ai_charge, 5, null),
            new Frame(GameAI.ai_charge, 6, null),
            new Frame(GameAI.ai_charge, 6, null),
            new Frame(GameAI.ai_charge, 4, null),
            new Frame(GameAI.ai_charge, 3, chick_rerocket) };

    static MonsterMove chick_move_attack1 = new MonsterMove(FRAME_attak114,
            FRAME_attak127, chick_frames_attack1, null);

    static Frame chick_frames_end_attack1[] = new Frame[] {
            new Frame(GameAI.ai_charge, -3, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, -6, null),
            new Frame(GameAI.ai_charge, -4, null),
            new Frame(GameAI.ai_charge, -2, null) };

    static MonsterMove chick_move_end_attack1 = new MonsterMove(FRAME_attak128,
            FRAME_attak132, chick_frames_end_attack1, chick_run);

    static EntityThinkAdapter chick_reslash = new EntityThinkAdapter() {
    	public String getID() { return "chick_reslash"; }
        public boolean think(Entity self) {
            if (self.enemy.health > 0) {
                if (GameUtil.range(self, self.enemy) == Constants.RANGE_MELEE)
                    if (Lib.random() <= 0.9) {
                        self.monsterinfo.currentmove = chick_move_slash;
                        return true;
                    } else {
                        self.monsterinfo.currentmove = chick_move_end_slash;
                        return true;
                    }
            }
            self.monsterinfo.currentmove = chick_move_end_slash;
            return true;
        }
    };

    static Frame chick_frames_slash[] = new Frame[] {
            new Frame(GameAI.ai_charge, 1, null),
            new Frame(GameAI.ai_charge, 7, ChickSlash),
            new Frame(GameAI.ai_charge, -7, null),
            new Frame(GameAI.ai_charge, 1, null),
            new Frame(GameAI.ai_charge, -1, null),
            new Frame(GameAI.ai_charge, 1, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 1, null),
            new Frame(GameAI.ai_charge, -2, chick_reslash) };

    static MonsterMove chick_move_slash = new MonsterMove(FRAME_attak204,
            FRAME_attak212, chick_frames_slash, null);

    static Frame chick_frames_end_slash[] = new Frame[] {
            new Frame(GameAI.ai_charge, -6, null),
            new Frame(GameAI.ai_charge, -1, null),
            new Frame(GameAI.ai_charge, -6, null),
            new Frame(GameAI.ai_charge, 0, null) };

    static MonsterMove chick_move_end_slash = new MonsterMove(FRAME_attak213,
            FRAME_attak216, chick_frames_end_slash, chick_run);

    static EntityThinkAdapter chick_slash = new EntityThinkAdapter() {
    	public String getID() { return "chick_slash"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = chick_move_slash;
            return true;
        }
    };

    static Frame chick_frames_start_slash[] = new Frame[] {
            new Frame(GameAI.ai_charge, 1, null),
            new Frame(GameAI.ai_charge, 8, null),
            new Frame(GameAI.ai_charge, 3, null) };

    static MonsterMove chick_move_start_slash = new MonsterMove(FRAME_attak201,
            FRAME_attak203, chick_frames_start_slash, chick_slash);

    static EntityThinkAdapter chick_melee = new EntityThinkAdapter() {
    	public String getID() { return "chick_melee"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = chick_move_start_slash;
            return true;
        }
    };

    static EntityThinkAdapter chick_attack = new EntityThinkAdapter() {
    	public String getID() { return "chick_attack"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = chick_move_start_attack1;
            return true;
        }
    };

    static EntInteractAdapter chick_sight = new EntInteractAdapter() {
    	public String getID() { return "chick_sight"; }
        public boolean interact(Entity self, Entity other) {
            ServerGame.PF_StartSound(self, Constants.CHAN_VOICE, sound_sight, (float) 1, (float) Constants.ATTN_NORM,
            (float) 0);
            return true;
        }
    };

    /*
     * QUAKED monster_chick (1 .5 0) (-16 -16 -24) (16 16 32) Ambush
     * Trigger_Spawn Sight
     */
    public static void SP_monster_chick(Entity self) {
        if (GameBase.deathmatch.value != 0) {
            GameUtil.G_FreeEdict(self);
            return;
        }

        sound_missile_prelaunch = ServerInit.SV_SoundIndex("chick/chkatck1.wav");
        sound_missile_launch = ServerInit.SV_SoundIndex("chick/chkatck2.wav");
        sound_melee_swing = ServerInit.SV_SoundIndex("chick/chkatck3.wav");
        sound_melee_hit = ServerInit.SV_SoundIndex("chick/chkatck4.wav");
        sound_missile_reload = ServerInit.SV_SoundIndex("chick/chkatck5.wav");
        sound_death1 = ServerInit.SV_SoundIndex("chick/chkdeth1.wav");
        sound_death2 = ServerInit.SV_SoundIndex("chick/chkdeth2.wav");
        sound_fall_down = ServerInit.SV_SoundIndex("chick/chkfall1.wav");
        sound_idle1 = ServerInit.SV_SoundIndex("chick/chkidle1.wav");
        sound_idle2 = ServerInit.SV_SoundIndex("chick/chkidle2.wav");
        sound_pain1 = ServerInit.SV_SoundIndex("chick/chkpain1.wav");
        sound_pain2 = ServerInit.SV_SoundIndex("chick/chkpain2.wav");
        sound_pain3 = ServerInit.SV_SoundIndex("chick/chkpain3.wav");
        sound_sight = ServerInit.SV_SoundIndex("chick/chksght1.wav");
        sound_search = ServerInit.SV_SoundIndex("chick/chksrch1.wav");

        self.movetype = Constants.MOVETYPE_STEP;
        self.solid = Constants.SOLID_BBOX;
        self.s.modelindex = ServerInit.SV_ModelIndex("models/monsters/bitch/tris.md2");
        Math3D.VectorSet(self.mins, -16, -16, 0);
        Math3D.VectorSet(self.maxs, 16, 16, 56);

        self.health = 175;
        self.gib_health = -70;
        self.mass = 200;

        self.pain = chick_pain;
        self.die = chick_die;

        self.monsterinfo.stand = chick_stand;
        self.monsterinfo.walk = chick_walk;
        self.monsterinfo.run = chick_run;
        self.monsterinfo.dodge = chick_dodge;
        self.monsterinfo.attack = chick_attack;
        self.monsterinfo.melee = chick_melee;
        self.monsterinfo.sight = chick_sight;

        World.SV_LinkEdict(self);

        self.monsterinfo.currentmove = chick_move_stand;
        self.monsterinfo.scale = MODEL_SCALE;

        GameAI.walkmonster_start.think(self);
    }
}