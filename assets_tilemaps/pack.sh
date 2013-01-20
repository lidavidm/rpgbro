#!/bin/sh

java -classpath ../main/libs/gdx.jar:gdx-tools.jar:gdx-tiled-preprocessor.jar \
    com.badlogic.gdx.tiledmappacker.TiledMapPacker \
    . \
    ../assets/maps \
    --strip-unused
