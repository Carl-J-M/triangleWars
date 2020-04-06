public abstract class RangedSpell extends Spell {
    private int range, power;

    public RangedSpell(String name, int manaCost, int range, int power) {
        super(name, manaCost);
        this.range = range;
        this.power = power;
    }

    public abstract void applySpellEffect(Character character);
}
