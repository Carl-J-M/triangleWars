package Items;

public abstract class Consumable extends Item implements IConsumable {
    public Consumable(int weight, int value) {
        super(weight, value);
    }

}
