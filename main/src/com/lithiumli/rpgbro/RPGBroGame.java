package com.lithiumli.rpgbro;

import com.badlogic.gdx.Game;

import com.lithiumli.rpgbro.screens.*;

public class RPGBroGame extends Game {
    @Override
    public void create() {
        TitleScreen screen = new TitleScreen(this);
        this.setScreen(screen);
    }
}
