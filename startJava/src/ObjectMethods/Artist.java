package ObjectMethods;

import java.util.Objects;

public class Artist implements Cloneable {
    private String name;
    private int age;

    Artist( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("Artist[name=%s, age=%d]", name, age);
    }

    public boolean equals(Object o) {
        if ( !( o instanceof Artist)) return false;
        Artist others = (Artist) o;
        return others.name == name && others.age == age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Artist clone() throws CloneNotSupportedException {
        return (Artist) super.clone();
    }

}
