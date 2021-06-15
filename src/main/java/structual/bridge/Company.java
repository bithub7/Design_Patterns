package structual.bridge;

public abstract class Company {

    protected Worker worker;

    protected Company(Worker worker) {
        this.worker = worker;
    }

    public abstract void fixProblems();
}
