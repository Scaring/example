package AbstractFactory.banking;

import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new BankingDeveloler();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
    
}
