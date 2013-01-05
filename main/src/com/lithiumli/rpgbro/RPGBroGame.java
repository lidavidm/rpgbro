package com.lithiumli.rpgbro;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.FPSLogger;

import com.lithiumli.rpgbro.screens.*;

public class RPGBroGame extends Game {
    @Override
    public void create() {
        TitleScreen screen = new TitleScreen();
        this.setScreen(screen);
    }
}
