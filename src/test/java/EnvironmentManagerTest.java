import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnvironmentManagerTest {
    EnvironmentManager environmentManager;
    Environment environment;
    ArrayList<Tile> tileSet;
    Tile tile, tile2;
    Humanoid humanoid;
    @Before
    public void setUp(){
        tile = new Tile(1, 1, "Ground");
        tile2 = new Tile(1, 2, "Ground");
        tileSet = new ArrayList<Tile>();
        tileSet.add(tile);
        tileSet.add(tile2);
        environment = new Environment(1, 2, tileSet);
        environmentManager = new EnvironmentManager(environment);
        humanoid = new Humanoid("Romormanna", 29, 100, 100, "English");
    }
    @Test
    public void tileSetHasTiles(){
        assertEquals(2, environmentManager.getTileSetSize());
    }
    @Test
    public void environmentHasTiles(){
        assertEquals(2, environment.getTotalTiles());
    }
//    @Test
//    public void environmentManagerCanGetSpecificTile(){
//        assertEquals(tile, environmentManager.getTile(0));
//    }
}
