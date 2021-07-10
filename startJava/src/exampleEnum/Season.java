package exampleEnum;

public class Season {
    private String season;
    public final static Season WINTER = new Season("WINTER");
    public final static Season AUTUMN = new Season("AUTUMN");
    public final static Season SPRING = new Season("SPRING");
    public final static Season SUMMER = new Season("SUMMER");

    private Season(String season) {
        this.season = season;
    }
}
