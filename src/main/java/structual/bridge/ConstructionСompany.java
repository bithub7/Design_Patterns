package structual.bridge;

public class Construction–°ompany extends Company {

    public Construction–°ompany(Worker worker) {
        super(worker);
    }

    @Override
    public void fixProblems() {
        System.out.println("Construction company fix problem");
        worker.work();

    }
}
