package main;

import java.util.ArrayList;
import java.util.Random;

class dummy {
    protected int health = 100;
    protected int defence = 1;
    protected int attack = 15;
    protected float agility = 0.5f;
    protected float luck = 0.25f;
    protected float critIncrement = 0.25f;
    protected ArrayList<String> abilityMap = new ArrayList<String>();
    protected String name = "dummy";
    protected Random randomGenerator = new Random();

    public String getName() {
        return name;
    }

    protected final void setName(String n) {
        this.name = n;
    }

    public dummy(int health, int defence, int attack, float agility, float luck) {
        this.health = health;
        this.defence = defence;
        this.attack = attack;
        this.agility = agility;
        this.luck = luck;
        addMapping();

    }

    public dummy() {
        this.health = 100;
        this.defence = 1;
        this.attack = 15;
        this.agility = 0.5f;
        this.luck = 0.25f;
        addMapping();
    }

    protected void addMapping() { // overwrite with custom ability mapping
        abilityMap.add("No action"); // 0
        abilityMap.add("attack"); // 1
        abilityMap.add("defend"); // 2
        abilityMap.add("surround"); // 3

    }

    public String toString() {
        return name + " health: " + health;
    }

    public final int getHealth() {
        return health;
    }

    public int processTurn(match mat) { // overwrite with AI decision making
        return 0;
    }

    public final String getAbility(int i) {
        return abilityMap.get(i);
    }

    protected final int getRandom(int min, int max) {
        return randomGenerator.nextInt(max) + min;
    }

    public final boolean isAlive() {
        if (health <= 0) {
            return false;
        }
        return true;
    }

    protected final void takeDamage(int damage, float opponentLuck, float critIncrement) {
        int dmg = damage - defence;
        if (randomGenerator.nextFloat() <= opponentLuck) {
            health -= Math.floor(dmg + (dmg * critIncrement));
        } else {
            health -= dmg;
        }
    }
}
