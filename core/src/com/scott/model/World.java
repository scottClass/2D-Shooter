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
    private Player player;
    private Enemy goomba;
    
    public World() {
        blocks = new Array<Block>();
        demoLevel();
    }
    
    private void demoLevel() {
        player = new Player(16, 16, 16, 32);
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
    
    public Player getPlayer() {
        return player;
    }
    
    public Enemy getGoomba() {
        return goomba;
    }
    
    public Array<Block> getBlocks() {
        return blocks;
    }
}
