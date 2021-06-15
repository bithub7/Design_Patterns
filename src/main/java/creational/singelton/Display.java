package creational.singelton;

public class Display {
    private static Display display;
    private static String displayСontent;


    public static synchronized Display getDisplay() {
        if (display == null) {
            display = new Display();
        }
        return display;
    }

    private Display() {

    }

    public void changeDisplayСontent(String displayСontent) {
        this.displayСontent = displayСontent;
    }

    public String getDisplayСontent(){
        return displayСontent;
    }

}