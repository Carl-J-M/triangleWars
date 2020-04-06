package Items;

import Items.IEquippable;
import Items.Item;

public abstract  class Weapon extends Item implements IEquippable {
    private int damage;
    private String name, type;

    public Weapon(int weight, int value, int damage, String name, String type) {
        super(weight, value);
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public void basicAttack(Character character){
        character.damageHealth(this.damage);
    }
}
