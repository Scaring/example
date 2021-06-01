package FactoryMethod;

public class Program {
    static DeveloperFactory CreateDevFactoryBySpec(String spec){
        if (spec.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else if(spec.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(spec + " is unknown spec!");
        }
    }
    public static void main(String[] args) {
        DeveloperFactory developerFactory = CreateDevFactoryBySpec("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writesCode();
    }
}
