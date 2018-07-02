package org.multiverseking.hexgridapi.events;

/**
 *
 * @author Eike Foede
 */
public interface MapDataListener {

    /**
     * Called on one or multiple tile change.
     * @param events 
     */
    void onTileChange(TileChangeEvent... events);

    /**
     * Called when all data get clean.
     */
//    void onProceduralGenReset(Generator generator);
//    /**
//     * Called when the current Procedural gen get removed. (all current data are reset)
//     */
//    void onProceduralGenRemoved();
}
