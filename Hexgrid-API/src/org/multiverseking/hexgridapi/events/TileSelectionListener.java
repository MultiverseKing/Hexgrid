package org.multiverseking.hexgridapi.events;

import java.util.ArrayList;
import org.multiverseking.hexgridapi.core.coordinate.HexCoordinate;

/**
 * Allow Class to get the cursor position update from hexgrid.
 * @author roah
 */
public interface TileSelectionListener {

    public void onTileSelectionUpdate(HexCoordinate currentSelection, ArrayList<HexCoordinate> selectedList);
}
