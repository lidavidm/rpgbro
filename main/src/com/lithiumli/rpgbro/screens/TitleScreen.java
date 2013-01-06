package com.lithiumli.rpgbro.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;

import com.lithiumli.rpgbro.RPGBroGame;

public class TitleScreen extends LithiumScreen {
    private BitmapFont font;
    public TitleScreen(RPGBroGame g) {
        super(g);
        font = new BitmapFont(Gdx.files.internal("assets/pts_r.fnt"),
                              Gdx.files.internal("assets/pts_r.png"), false);

        Stage stage = g.getStage();
        Gdx.input.setInputProcessor(stage);

        Table table = new Table();
        table.setFillParent(true);
        table.debug();
        stage.addActor(table);

        Label.LabelStyle style = new Label.LabelStyle();
        style.font = font;
        TextButton.TextButtonStyle buttonStyle = new TextButton.TextButtonStyle();
        buttonStyle.font = font;
        buttonStyle.downFontColor = Color.BLUE;

        Label titleLabel = new Label("Title of game", style);
        table.add(titleLabel);

        table.row();
        table.add(new TextButton("New Game", buttonStyle));
        table.row();
        table.add(new TextButton("Load Save", buttonStyle));
        table.row();
        table.add(new TextButton("Quit", buttonStyle));
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        // spriteBatch.setProjectionMatrix(camera.combined);
        // spriteBatch.begin();

        // String text = "Touch screen to start!";
		// float width = font.getBounds(text).width;
		// font.draw(spriteBatch, text, 240 - width / 2, 128);

        // spriteBatch.end();
    }

    @Override
	public void dispose() {
        super.dispose();

		font.dispose();
	}
}
