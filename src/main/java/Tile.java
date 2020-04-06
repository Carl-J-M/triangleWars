import java.util.ArrayList;

public class Tile {

    private Tile tile;
    private int tileX, tileY;
    private String type;
    private ArrayList<Character> character;

    public Tile(int tileX, int tileY, String type ){
        this.tileX = tileX;
        this.tileY = tileY;
        this.type = type;
        this.character = new ArrayList<Character>();

    }
    public int getTileX(){
        return this.tileX;
    }
    public int getTileY(){
        return this.tileY;
    }

    public String getType() {
        return this.type;
    }

    public void addCharacter(Humanoid human) {
        character.add(human);
    }

    public Humanoid getCharacter() {
        return (Humanoid) character.get(0);
    }
}
