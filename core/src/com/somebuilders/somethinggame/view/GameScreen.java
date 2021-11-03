package com.somebuilders.somethinggame.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.somebuilders.somethinggame.model.Freddy;

public class GameScreen implements Screen {

    private Texture freddyTexture;
    private SpriteBatch batch;
    private Freddy freddy;

    @Override
    public void show() {
        batch = new SpriteBatch();
        freddyTexture = new Texture(Gdx.files.internal("Freddy.png"));
        freddy = new Freddy(freddyTexture,0,0,242,400);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        freddy.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        freddyTexture.dispose();
        batch.dispose();
    }
}
