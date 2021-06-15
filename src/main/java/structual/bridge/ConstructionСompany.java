package structual.bridge;

public class ConstructionСompany extends Company {

    public ConstructionСompany(Worker worker) {
        super(worker);
    }

    @Override
    public void fixProblems() {
        System.out.println("Construction company fix problem");
        worker.work();

    }
}
