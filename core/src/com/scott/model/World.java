/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scott.model;

import com.badlogic.gdx.utils.Array;

/**
 *
 * @author johns6971
 */
public class World {
    private Array <Block> blocks;
    private Mario player;
    private Goomba goomba;
    
    public World() {
        blocks = new Array<Block>();
        demoLevel();
    }
    
    private void demoLevel() {
        player = new Mario(16, 16, 16, 32);
        goomba = new Goomba(60, 16, player.getWidth(), player.getHeight());
        //blocks along the floor
        for(int i = 0; i < 50; i++) {
            Block b = new Block(i*16, 0, 16, 16);
            blocks.add(b);
        }
        blocks.add(new Block(48, 16, 16, 16));
        blocks.add(new Block(96, 32, 16, 16));
        blocks.add(new Block(112, 32, 16, 16));
        blocks.add(new Block(128, 96, 16, 16));
        blocks.add(new Block(112, 96, 16, 16));
    }
    
    public void update(float delta) {
        
    }
    
    public Mario getPlayer() {
        return player;
    }
    
    public Goomba getGoomba() {
        return goomba;
    }
    
    public Array<Block> getBlocks() {
        return blocks;
    }
}
