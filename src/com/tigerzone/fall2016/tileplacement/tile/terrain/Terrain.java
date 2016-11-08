package com.tigerzone.fall2016.tileplacement.tile.terrain;

/**
 * Created by Aidan on 11/7/2016.
 */
public abstract class Terrain implements TerrainVisitor {

    public abstract boolean accept(TerrainVisitor terrainVisitor);

    public boolean isFree(){
        return false;
    }

}
