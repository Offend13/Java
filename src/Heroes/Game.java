package Heroes;

public class Game {
    public static void main(String[] args) {
        Goku hero1 = new Goku("Goku", 400, 200);
        Mage hero2 = new Mage("Jeina", 200, 800);
        Superman hero3 = new Superman("Kal-El", 500, 300);

        hero1.firePrimary(hero2);
        hero1.firePrimary(hero3);



        hero2.fireSecondary(hero1);
        hero2.firePrimary(hero3);


        hero3.firePrimary(hero1);
        hero3.fireSecondary(hero2);


        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }
}
