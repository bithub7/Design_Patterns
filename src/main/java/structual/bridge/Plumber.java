package structual.bridge;

public class Plumber implements Worker {
    @Override
    public void work() {
        System.out.println("Plumber fixing plumbing");
    }
}
