package com.lithiumli.rpgbro.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Screen;

public class TitleScreen extends LithiumScreen {
    private BitmapFont font;

    public TitleScreen() {
        super();
        font = new BitmapFont(Gdx.files.internal("assets/pts_r.fnt"),
                              Gdx.files.internal("assets/pts_r.png"), false);
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();

        String text = "Touch screen to start!";
		float width = font.getBounds(text).width;
		font.draw(spriteBatch, text, 240 - width / 2, 128);

        spriteBatch.end();
    }

    @Override
	public void dispose() {
        super.dispose();

		font.dispose();
	}
}
