package LinkedTypes.Person;

public class Person implements Cloneable{
    private String name;
    private int age;
     
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.printf("Person Name: %s \n", name);
    }

    public Person clone() throws CloneNotSupportedException{
      return (Person) super.clone();
    }
}
