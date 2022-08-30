package game;

public class Main {
    public static void main(String[] args) {
        //BaseHero hero1 = new BaseHero("pere", 100, 10, new int[]{2, 5}, 11, 11);
        //System.out.println(hero1.getInfo());
        //Peasant heroBrin = new Peasant("Brin", 1, 1, new int[] {1, 1}, 0, 3, true);
        //System.out.println(heroBrin.getInfo());
        Rogue rog1 = new Rogue("Roga1", 10, 8, new int[] {2, 4}, 3, 6);
        System.out.println(rog1.getInfo());
    }
}