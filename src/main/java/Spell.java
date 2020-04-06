public abstract class Spell {
    private Spell spell;
    private String name;
    public int manaCost;

    public Spell(String name, int manaCost){
        this.name = name;
        this.manaCost = manaCost;
    }

    public abstract void castSpell(Character target);
}
