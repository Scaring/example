package AbstractFactory.banking;

import AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void managesProject(){
        System.out.println("Project manager manages banking project...");
    }
}
