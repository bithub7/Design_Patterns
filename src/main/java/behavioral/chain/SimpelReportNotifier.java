package behavioral.chain;

public class SimpelReportNotifier extends Notifier{

    public SimpelReportNotifier(int priority){
        super(priority);
    }

    @Override
    public void write(String message) {

System.out.println("Notufying using simple report: " + message);
    }

}
