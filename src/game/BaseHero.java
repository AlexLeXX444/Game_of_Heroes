package game;

public class BaseHero {
    private int[] attack = new int[2];
    private int defence;
    private int speed;
    private int damage;

    private int healPoint;
    private String name;


    public BaseHero(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        this.name = name;
        this.damage = damage;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.healPoint = healPoint;

    }

    public BaseHero (int healPoint, int damage, int[] attack, int defence, int speed) {
        this("Default name", healPoint, damage, attack,defence, speed);
    }

    public String getInfo() {
        return String.format("Name %s \t:::\t HP %d \t:::\t Damage %d", this.name, this.healPoint, this.damage);
    }

/*
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
*/
}
