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

    @Override
    public void render() {
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        Gdx.gl.glViewport(0, 0, width, height);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
        // Table.drawDebug(stage);

        super.render();
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
