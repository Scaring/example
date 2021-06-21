package LinkedTypes;

import LinkedTypes.Book.Book;

public class LinkedTypes {
    public static void main(String[] args) {
                  
        try{
            Book book = new Book("War and Peace", "Leo Tolstoy");
            Book book2 = book.clone();
            book2.setAuthor("Ivan Turgenev");
            System.out.println(book.getAuthor());
            System.out.println(book2.getAuthor());
        }
        catch(CloneNotSupportedException ex){
                 
            System.out.println("Cloneable not implemented");
        }

        // try{
        //     Person tom = new Person("Tom", 23);
        //     Person bob = tom.clone();
        //     bob.setName("Bob");
        //     tom.display();      // Person Tom
        //     bob.display();
        // }
        // catch(CloneNotSupportedException ex){
                          
        //     System.out.println("Clonable not implemented");
        // }
    }
}
