package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Vacancy 1");
        jobSite.addVacancy("Vacancy 2");

        Observer sub1 = new Subscriber("name1 surname1");
        Observer sub2 = new Subscriber("name2 surname2");

        jobSite.addObserver(sub1);
        jobSite.addObserver(sub2);

        jobSite.addVacancy("Vacancy 3");

        jobSite.removeVacancy("Vacancy 1");

    }

}
