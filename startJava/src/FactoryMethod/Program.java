package FactoryMethod;

public class Program {
    static DeveloperFactory CreateDevFactoryBySpec(String spec){
        if (spec.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(spec + " is unknown spec!");
        }
    }
    public static void main(String[] args) {
        DeveloperFactory developerFactory = CreateDevFactoryBySpec("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writesCode();
    }
}
