package AbstractFactory;

import AbstractFactory.banking.BankingTeamFactory;

public class SuperBank {
    public static void main(String[] args) {
        ProjectTeamFactory team = new BankingTeamFactory();
        Developer developer = team.getDeveloper();
        Tester tester = team.getTester();
        ProjectManager pm = team.getProjectManager();

        System.out.println("Creating Super Bank project...");
        developer.writesCode();
        tester.testsCode();
        pm.managesProject();
    }
}
