package game.Interfaces;

public interface ActionsHero {
    int dealDamage();
    int dealHealing();
    void getDamage(int damage);
    boolean getStatus();
    void changePosition();
    String getCondition();
}
