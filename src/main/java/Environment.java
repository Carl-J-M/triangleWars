


import java.awt.*;
import java.util.ArrayList;

public class Environment extends Canvas {
    private int height, width;
    private ArrayList<Character> characters;
    private ArrayList<Tile> tiles;

    public Environment(int height, int width, ArrayList<Tile> tiles){
        this.height = height;
        this.width = width;
        this.tiles = tiles;
    }

    public int getTotalTiles() {
        return tiles.size();
    }
    public Tile getTile(int index) {
        return this.tiles.get(index);
    }
}
