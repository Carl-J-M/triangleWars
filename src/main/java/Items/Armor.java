package Items;

public abstract class Armor extends Item {
    private int armorValue;
    private String name, type;

    public Armor(int weight, int value, int armorValue, String name, String type) {
        super(weight, value);
        this.name = name;
        this.type = type;
        this.armorValue = armorValue;
    }

    public int getArmorValue(){
        return this.armorValue;
    }
}
