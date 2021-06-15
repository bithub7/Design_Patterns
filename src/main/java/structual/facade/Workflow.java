package structual.facade;

public class  Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem(){
        job.doJob();
        bugTracker.startString();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
