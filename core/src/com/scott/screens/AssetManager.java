/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scott.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 *
 * @author johns6971
 */
public class AssetManager {
    
    private static TextureAtlas atlas;
    public static TextureRegion block;
    public static TextureRegion stand;
    public static TextureRegion standL;
    public static TextureRegion jump;
    public static TextureRegion jumpL;
    public static Animation run;
    public static Animation runL;
    
    public static void load() {
        atlas = new TextureAtlas("Mario.pack");
        block = atlas.findRegion("stoneBlock");
        stand = atlas.findRegion("stand");
        standL = new TextureRegion(stand);
        standL.flip(true, false);
        jump = atlas.findRegion("jump");
        jumpL = new TextureRegion(jump);
        jumpL.flip(true, false);
        
        Array<AtlasRegion> run = atlas.findRegions("run");
        AssetManager.run = new Animation(0.1f, run);
        
        run = atlas.findRegions("run");
        runL = new Animation(0.1f, run);
        for(TextureRegion r: runL.getKeyFrames()) {
            r.flip(true, false);
        }
    }
    
}
