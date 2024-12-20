package BuilderPractice;

public class BuliderPattern {
    public static void main(String[] args) {

        //Abstraction --> Revealing the functionality and hiding the implementation
        BankingSite site = new BankingSite("Admin");

        site.login()
                .navigateToBalancesTab()
                .viewCurrentBalanceAsOfDate()
                .viewCredits()
                .generateStatements()
                .logOut();

        BankingSite prabhakar = new BankingSite("Prabhakar");

        prabhakar.login()
                .viewCredits()
                .generateStatements()
                .viewCurrentBalanceAsOfDate()
                .logOut();
    }


}
