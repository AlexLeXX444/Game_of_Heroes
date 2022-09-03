package game;

public interface ActionsHero {
    int dealDamage();
    int getDamage(int damage);
    boolean getStatus();
    void changePosition(); //выбираем только для мили героев.
    String getCondition();
}
