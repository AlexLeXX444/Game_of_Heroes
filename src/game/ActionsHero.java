package game;

public interface ActionsHero {
    int dealDamage();
    void getDamage(int damage);
    boolean getStatus();
    void changePosition();
    String getCondition();
}