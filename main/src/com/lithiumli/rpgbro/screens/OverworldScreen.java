package com.lithiumli.rpgbro.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.tiled.TileAtlas;
import com.badlogic.gdx.graphics.g2d.tiled.TiledLoader;
import com.badlogic.gdx.graphics.g2d.tiled.TiledMap;
import com.badlogic.gdx.graphics.g2d.tiled.TileMapRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Screen;

import com.lithiumli.rpgbro.RPGBroGame;

public class OverworldScreen extends LithiumScreen {
    TileMapRenderer tileMapRenderer;
    Sprite sprite;
    Texture texture;
    SpriteBatch spriteBatch;

    public OverworldScreen(RPGBroGame g) {
        super(g);
        TiledMap tiledMap = TiledLoader.createMap(Gdx.files.internal("assets/maps/world.tmx"));
        TileAtlas tileAtlas = new TileAtlas(tiledMap, Gdx.files.internal("assets/maps"));
        tileMapRenderer = new TileMapRenderer(tiledMap, tileAtlas, 8, 8);

        texture = new Texture(Gdx.files.internal("assets/characters/bm.png"));
        sprite = new Sprite(texture);
        sprite.setSize(32, 48);
        sprite.setPosition(0, 0);
        spriteBatch = new SpriteBatch();
        spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, WIDTH, HEIGHT);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        switchToContentViewport();
        tileMapRenderer.render(camera);

        spriteBatch.begin();
        sprite.draw(spriteBatch);
        spriteBatch.end();
    }
}
