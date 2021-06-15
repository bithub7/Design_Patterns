package structual.bridge;

import javax.sound.midi.Soundbank;

public class PlumbingСompany extends Company{

    public PlumbingСompany(Worker worker) {
        super(worker);
    }

    @Override
    public void fixProblems() {
        System.out.println("Plumbing company fix problem");
        worker.work();

    }
}
