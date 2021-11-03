package com.somebuilders.somethinggame.model;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Rectangle;

abstract class GameObject {

    Rectangle bounds;
    Sprite object;

    GameObject(Texture texture, float x, float y, float width, float height) {
        bounds = new Rectangle((int)x,(int)y,(int)width,(int)height);
        object = new Sprite(texture);
    }
    public void draw(SpriteBatch batch){
        object.setBounds((float)bounds.getX(),(float)bounds.getY(),(float)bounds.getWidth(),(float)bounds.getHeight());
        object.draw(batch);
    }

}
