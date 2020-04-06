package Items;

import Items.Item;

public class Sword extends Weapon {
    public Sword(int weight, int value, int damage, String name, String type) {
        super(weight, value, damage, name, type);
    }

    public void addToInventory() {

    }

    public void equipItem() {

    }

    public void equipItem(Character character, Item item) {
        character.equipWeapon(item);
    }
}
