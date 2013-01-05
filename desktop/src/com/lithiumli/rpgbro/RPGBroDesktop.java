package com.lithiumli.rpgbro;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class RPGBroDesktop {

    public static void main( String[] args ) {
        LwjglApplicationConfiguration cf = new LwjglApplicationConfiguration();
        cf.title = "RPGBro";
        cf.useGL20 = true;
        cf.width = 640;
        cf.height = 640;

        new LwjglApplication( new RPGBroGame(), cf );
    }
}
