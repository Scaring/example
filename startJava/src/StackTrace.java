public class StackTrace {

    private static String book = null;
    public static void main(String[] args) {
        String bk = getBook();
        System.out.println(bk);
    }

    public String toString() {
        return String.format("Book[name=%s]", book);
    }

    public static String getBook(){
        System.out.println(book.toString());
        return book;
    }
}
