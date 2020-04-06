import Items.Armor;
import Items.Item;
import Items.Weapon;

import java.util.ArrayList;

public abstract class Character {
    private int health, mana, age;
    private String name;
    private boolean isAlive;
    private ArrayList<Item> inventory;
    private ArrayList<Armor> equippedArmor;
    private ArrayList<Weapon> equippedWeapon;
    private ArrayList<Spell> spellbook;

    public Character(String name, int age, int health, int mana){
        this.health = health;
        this.mana = mana;
        this.age = age;
        this.name = name;
        this.inventory = new ArrayList<Item>();
        this.equippedArmor = new ArrayList<Armor>();
        this.equippedWeapon = new ArrayList<Weapon>();
        this.spellbook = new ArrayList<Spell>();
        this.isAlive = true;
    }

    public void addToInventory(Item item){
        this.inventory.add(item);
    }
    public void attack(Character enemy, Weapon weapon) {
        enemy.damageHealth(weapon.getDamage());
        if (enemy.getCharacterHealth() <= 0){
            enemy.killCharacter();
        }
    }
    public int totalItems() {
        return this.inventory.size();
    }

    public int getTotalInventoryValue(){
        int totalValue = 0;
        for(Item item : this.inventory){
            totalValue += item.getValue();
        }
        return totalValue;
    }

    public void equipArmor(Armor armor){
        equippedArmor.add(armor);
    }
    public int totalEquippedArmor() {
        return equippedArmor.size();
    }
    public Weapon getFirstWeapon(){
        return this.equippedWeapon.get(0);
    }
    public int getCombinedDefense() {
        return equippedArmor.get(0).getArmorValue() + getCharacterHealth();
    }
    public int getCharacterHealth() {
        return this.health;
    }
    public void addToHealth(int healingValue) { this.health += healingValue; }
    public void setHealth(int maxHealth) { this.health = maxHealth; }
    public void damageHealth(int damage) { this.health -= damage; }
    public void equipWeapon(Item item) { equippedWeapon.add((Weapon)item); }
    public boolean deathStatus() { return this.isAlive; }
    public void killCharacter(){ this.isAlive = false; }
    public void ressurectCharacter(int health){
        this.isAlive = true;
        this.health = health;
    }

    public int getMana() {
        return this.mana;
    }

    public void reduceMana(int manaCost) {
        this.mana -= manaCost;
    }

    public void learnSpell(Spell spell) {
        this.spellbook.add(spell);
    }

    public int getTotalSpells() {
        return this.spellbook.size();
    }

    public void castSpell(Spell spell, Character target) {
        if (this.mana >= spell.manaCost){
            this.mana -= spell.manaCost;
            spell.castSpell(target);
        }
    }
}
