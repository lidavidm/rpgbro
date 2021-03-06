package com.lithiumli.rpgbro.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

import com.lithiumli.rpgbro.RPGBroGame;

public class TitleScreen extends LithiumScreen {
    private BitmapFont font;
    public TitleScreen(final RPGBroGame g) {
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

        TextButton newGame = new TextButton("New Game", buttonStyle);

        table.row();
        table.add(newGame);
        table.row();
        table.add(new TextButton("Load Save", buttonStyle));
        table.row();
        table.add(new TextButton("Quit", buttonStyle));

        newGame.addListener(new ChangeListener() {
                public void changed (ChangeEvent event, Actor actor) {
                    game.setScreen(new OverworldScreen(g));
                }
            });

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        game.renderStage();

        switchToContentViewport();
    }

    @Override
	public void dispose() {
        super.dispose();

		font.dispose();
	}
}
