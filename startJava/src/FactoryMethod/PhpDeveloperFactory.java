package FactoryMethod;

public class PhpDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper(){
        return new PhpDeveloper();
    }
}
