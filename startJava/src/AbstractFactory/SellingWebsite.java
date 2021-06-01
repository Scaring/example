package AbstractFactory;

import AbstractFactory.website.WebsiteTeamFactory;

public class SellingWebsite {
    public static void main(String[] args) {
        ProjectTeamFactory team = new WebsiteTeamFactory();
        Developer developer = team.getDeveloper();
        Tester tester = team.getTester();
        ProjectManager pm = team.getProjectManager();

        System.out.println("Creating website project...");
        developer.writesCode();
        tester.testsCode();
        pm.managesProject();
    }
}
