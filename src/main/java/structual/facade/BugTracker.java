package structual.facade;

public class BugTracker {

    private boolean activeSprint;

    public boolean  isActiveSprint(){
        return activeSprint;
    }

    public void startString(){
        System.out.println("String is active.");
        activeSprint = true;
    }

    public void finishSpring(){
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}

