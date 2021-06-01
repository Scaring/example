package AbstractFactory.website;

import AbstractFactory.Developer;

public class WebsiteDeveloper implements Developer{

    @Override
    public void writesCode() {
        System.out.println("Website developer writes website project code...");        
    }
}
