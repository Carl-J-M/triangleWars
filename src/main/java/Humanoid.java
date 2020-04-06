import Items.Consumable;

public class Humanoid extends Character implements ICanTalk {
    private String language;
    public Humanoid(String name, int age, int health, int mana, String language) {
        super(name, age, health, mana);
        this.language = language;
    }

    public String sayHello() {
        return "Hello";
    }


    public void useConsumableItem(Consumable consumable, Character character) {
        consumable.useItem(character);
    }



}
