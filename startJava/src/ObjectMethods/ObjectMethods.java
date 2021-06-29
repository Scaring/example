package ObjectMethods;

public class ObjectMethods {
    public static void main(String[] args) throws CloneNotSupportedException {
        Artist Kianu = new Artist("Kianu Rives", 55);
        System.out.println(Kianu.getClass()); //class ObjectMethods.Artist
        System.out.println(Kianu instanceof Artist); // true

        Artist Rives = Kianu.clone();
        System.out.println(Rives.getName());
        System.out.println(Kianu.equals(Rives) && Kianu.hashCode() == Rives.hashCode());
        System.out.println(Rives.toString());
    }
}
