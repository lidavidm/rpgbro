package com.lithiumli.rpgbro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.lithiumli.rpgbro.screens.*;

public class RPGBroGame extends Game {
    private Stage stage;
    private int width;
    private int height;

    @Override
    public void create() {
        stage = new Stage();

        TitleScreen screen = new TitleScreen(this);
        this.setScreen(screen);
    }

    public void renderStage() {
        Gdx.gl.glViewport(0, 0, width, height);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Stage getStage() {
        return stage;
    }
}
