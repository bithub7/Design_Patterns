package structual.proxy;

public class ProjectRunner {
    public static void main(String[] args) {

        Project project = new ProxyProject("urlproject");

        project.run();
    }
}
