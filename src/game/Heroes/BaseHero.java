package game.Heroes;

import game.Interfaces.ActionsHero;

public abstract class BaseHero implements ActionsHero {
    private int[] attack = new int[2];

    private int defence;
    private int speed;
    private int damage;

    private final int healPoint;
    private int maxHealPoint;
    private final String name;
    private boolean state;
    private int[] position;
    private final String commandName;

    public BaseHero(String commandName, String name, int healPoint, int damage, int[] attack, int defence, int speed, int[] position) {
        this.commandName = commandName;
        this.name = name;
        this.damage = damage;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.healPoint = healPoint;
        this.position = position;

        this.maxHealPoint = healPoint;
        this.state = true;

    }

    public BaseHero (String commandName, String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        this(commandName,name, healPoint, damage, attack,defence, speed, new int[] {0, 0});
    }

    public String getInfo() {
        return String.format("Name %s \t:::\t HP %d \t:::\t Damage %d", this.name, this.healPoint, this.damage);
    }

    @Override
    public int dealDamage() {
        return this.damage;
    }

    @Override
    public void getDamage(int damage) {
        if ((this.maxHealPoint - damage) > 0 && (this.maxHealPoint - damage) < this.healPoint) {
            this.maxHealPoint -= damage;
        }
        else if ((this.maxHealPoint - damage) > this.healPoint) {
            this.maxHealPoint = this.healPoint;
        }
        else {
            this.state = false;
        }
    }

    @Override
    public boolean getStatus() {
        if (maxHealPoint > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void changePosition() {

    }

    @Override
    public String getCondition() {
        if (state) {
            return String.format("Name %s \t:::\t HP %d", this.name, this.maxHealPoint);
        } else {
            return "Dead";
        }
    }
}