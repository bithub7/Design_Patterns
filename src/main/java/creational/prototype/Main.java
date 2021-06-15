package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("Сапёр", "Головоломка", 5);

        GameFactory factory = new GameFactory(game);

        Game copyGame = factory.cloneGame();

        System.out.println(game);
        System.out.println(copyGame);


    }
}
