public class Century {
    public static void main(String[] args) {
        System.out.println(cent(200));        
    }

    public static int cent( int year ){
        return (year % 100) == 0 ? (year / 100) : (year / 100) + 1;
    }
}
