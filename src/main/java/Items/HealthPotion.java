package Items;

public class HealthPotion extends Consumable {
    private int healingValue;
    public HealthPotion(int weight, int value, int healingValue) {
        super(weight, value);
        this.healingValue = healingValue;
    }

    public void useItem(Character character) {
        int maxHealth = 100;
        if (character.getCharacterHealth() < maxHealth) {
            if (character.getCharacterHealth()+this.healingValue < maxHealth){
                character.addToHealth(this.healingValue);
            }
            character.setHealth(maxHealth);
        }
    }
}
