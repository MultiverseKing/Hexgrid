package org.multiverseking.hexgridapi.events;

import org.multiverseking.hexgridapi.core.data.HexTile;
import org.multiverseking.hexgridapi.core.coordinate.HexCoordinate;

/**
 *
 * @author Eike Foede, roah
 */
public class TileChangeEvent {

    protected HexCoordinate tilePos;
    protected HexTile oldTile;
    protected HexTile newTile;

    public TileChangeEvent(HexCoordinate tilePos, HexTile oldTile, HexTile newTile) {
        this.tilePos = tilePos;
        this.oldTile = oldTile;
        this.newTile = newTile;
    }

    /**
     * @return Odd-R Offset coordinate of the tile relative to mapGrid
     */
    public HexCoordinate getTilePos() {
        return tilePos;
    }

    public HexTile getOldTile() {
        return oldTile;
    }

    public HexTile getNewTile() {
        return newTile;
    }
}
