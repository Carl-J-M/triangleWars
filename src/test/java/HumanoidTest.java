import Items.Chainmail;
import Items.HealthPotion;
import Items.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanoidTest {
    Humanoid humanoid;
    Sword sword;
    Chainmail chainmail;
    @Before
    public void setUp(){
        sword = new Sword(12, 1000, 50, "Callandor", "Magical");
        chainmail = new Chainmail(40, 1500, 70, "Mithril Items.Chainmail", "Mail" );
        humanoid = new Humanoid("Romormanna", 29, 100, 100, "English");
    }
    @Test
    public void canAddItemToInventory(){
        humanoid.addToInventory(sword);
        assertEquals(1, humanoid.totalItems());
    }
    @Test
    public void getInventoryTotalValue(){
        humanoid.addToInventory(sword);
        assertEquals(1000, humanoid.getTotalInventoryValue());
    }
    @Test
    public void canEquipItemFromInventory(){
        humanoid.addToInventory(chainmail);
        humanoid.equipArmor(chainmail);
        assertEquals(1, humanoid.totalEquippedArmor());
    }
    @Test
    public void getTotalArmorValue(){
        humanoid.addToInventory(chainmail);
        humanoid.equipArmor(chainmail);
        assertEquals(170, humanoid.getCombinedDefense());
    }
    @Test
    public void healingPotionAddsToCharacterHealth(){
        HealthPotion potion = new HealthPotion(1, 100, 50);
        assertEquals(100, humanoid.getCharacterHealth());
        humanoid.useConsumableItem(potion, humanoid);
        assertEquals(150, humanoid.getCharacterHealth());
    }
    @Test
    public void healingPotionsWontHealPastMaxHealth(){
        HealthPotion potion = new HealthPotion(1, 100, 50);
        humanoid.useConsumableItem(potion, humanoid);
        assertEquals(100, humanoid.getCharacterHealth());
    }
    @Test
    public void canEquipWeapon(){
        humanoid.equipWeapon(sword);
        assertEquals(sword, humanoid.getFirstWeapon());
    }
    @Test
    public void canAttackWithEquippedWeapon(){
        Humanoid bandit = new Humanoid("Highwayman", 25, 100, 100, "English");
        humanoid.equipWeapon(sword);
        humanoid.attack(bandit, humanoid.getFirstWeapon());
        assertEquals(50, bandit.getCharacterHealth());
    }
    @Test
    public void charactersCanDieFromDamage(){
        Humanoid bandit = new Humanoid("Highwayman", 25, 100, 100, "English");
        humanoid.equipWeapon(sword);
        humanoid.attack(bandit, humanoid.getFirstWeapon());
        humanoid.attack(bandit, humanoid.getFirstWeapon());
        assertEquals(false, bandit.deathStatus());
    }
    @Test
    public void charactersCanBeRessurected(){
        Humanoid bandit = new Humanoid("Highwayman", 25, 100, 100, "English");
        bandit.killCharacter();
        assertEquals(false, bandit.deathStatus());
        bandit.ressurectCharacter(100);
        assertEquals(true, bandit.deathStatus());
    }
    @Test
    public void charactersCanHaveSpells(){
        Humanoid wizard = new Humanoid("Wizard", 330, 50, 300, "Ancient");
        Fireball fireball = new Fireball("Fireball", 100, 10, 100);
        wizard.learnSpell(fireball);
        assertEquals(1, wizard.getTotalSpells());

    }
    @Test
    public void charactersCanCastSpells(){
        Humanoid wizard = new Humanoid("Wizard", 330, 50, 300, "Ancient");
        Fireball fireball = new Fireball("Fireball", 100, 10, 100);
        wizard.learnSpell(fireball);
        Humanoid bandit = new Humanoid("Highwayman", 25, 100, 100, "English");
        wizard.castSpell(fireball, bandit);
        assertEquals(0, bandit.getCharacterHealth());

    }
    @Test
    public void spellsCostMana(){
        Humanoid wizard = new Humanoid("Wizard", 330, 50, 300, "Ancient");
        Fireball fireball = new Fireball("Fireball", 100, 10, 100);
        wizard.learnSpell(fireball);
        Humanoid bandit = new Humanoid("Highwayman", 25, 100, 100, "English");
        wizard.castSpell(fireball, bandit);

        assertEquals(200, wizard.getMana());
    }

}
