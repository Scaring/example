package AbstractFactory.website;

import AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager{

    @Override
    public void managesProject() {
         System.out.println("Website PM manages website project...");
    }
}
