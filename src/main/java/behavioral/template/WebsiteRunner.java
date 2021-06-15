package behavioral.template;

public class WebsiteRunner {

    public static void main(String[] args) {

        WebsiteTemplate siteWelcome = new WelcomePage();
        WebsiteTemplate siteNews = new NewsPage();

        siteWelcome.showPage();

        System.out.println();

        siteNews.showPage();

    }
}
