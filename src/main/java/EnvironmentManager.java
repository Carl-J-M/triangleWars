import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class EnvironmentManager {
    private Environment environment;
    private ArrayList<Character> characters;
    private ArrayList<Tile> tileSet;
    private Tile selectedTile;

    public EnvironmentManager(Environment environment){
        this.environment = environment;
        this.characters = new ArrayList<Character>();
        this.tileSet = new ArrayList<Tile>();

    }

    public int getTileSetSize() {
        return tileSet.size();
    }

//    public void main(String[] args) {
//        JFrame frame = new JFrame("Triangle Wars");
//        Tile tile = new Tile(1, 1, "Ground");
//        Tile tile2 = new Tile(2, 1, "Ground");
//        this.tileSet.add(tile);
//        this.tileSet.add(tile2);
//        Canvas canvas = new Environment(1, 1, tileSet);
//        canvas.setSize(400, 400);
//        frame.add(canvas);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    public void paint(Graphics g) {
//        g.drawRect( 0,0, 40,40 );     // Draw head
//        g.setColor(new Color(31, 21, 1));
//    }
}
