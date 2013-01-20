package com.lithiumli.rpgbro.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Screen;

import com.lithiumli.rpgbro.RPGBroGame;

public class LithiumScreen implements Screen {
    protected SpriteBatch spriteBatch;
    protected OrthographicCamera camera;
    protected Rectangle viewport;
    protected static final int WIDTH = 640;
    protected static final int HEIGHT = 640;
    protected RPGBroGame game;

    public LithiumScreen(RPGBroGame g) {
        game = g;
        spriteBatch = new SpriteBatch();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTH, HEIGHT);
        camera.update(true);

        viewport = new Rectangle(0, 0, 640, 640);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
    }

    protected void switchToContentViewport() {
        camera.update();
        Gdx.gl.glViewport((int) viewport.x, (int) viewport.y,
                          (int) viewport.width, (int) viewport.height);
    }

    @Override
    public void resize(int width, int height) {
        // Based on http://www.java-gaming.org/index.php?topic=25685.0
        float scale = 1.0f;
        Vector2 crop = new Vector2(0f, 0f);

        if (width > height) {
            scale = (float) height / (float) HEIGHT;
            crop.x = (width - WIDTH * scale) / 2f;
        }
        else if (width < height) {
            scale = (float) width / (float) WIDTH;
            crop.y = (height - HEIGHT * scale) / 2f;
        }
        else {
            scale = (float) width / (float) WIDTH;
        }

        float w = (float) WIDTH * scale;
        float h = (float) HEIGHT * scale;
        viewport.set(crop.x, crop.y, w, h);
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
	public void dispose () {
		spriteBatch.dispose();
	}
}
