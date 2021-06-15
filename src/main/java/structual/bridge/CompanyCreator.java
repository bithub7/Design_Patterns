package structual.bridge;

public class CompanyCreator {
    public static void main(String[] args) {
        Company company [] = {
                new PlumbingСompany(new Electrician()),
                new ConstructionСompany(new Plumber())
        };

        for(Company companyTemp : company) {
            companyTemp.fixProblems();
        }
    }
}
