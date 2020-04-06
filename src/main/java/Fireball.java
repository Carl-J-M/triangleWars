public class Fireball extends RangedSpell {
    Fireball fireball;
    private int power;

    public Fireball(String name, int manaCost, int range, int power) {
        super(name, manaCost, range, power);
        this.power = power;
    }

    public void applySpellEffect(Character character) {

    }

    public void castSpell(Character target) {
        target.damageHealth(this.power);
    }
}
