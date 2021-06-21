package Generics;

public class Program {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<String>("2334", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<String> acc2 = new Account<String>("12sid5523", 5000);
        String acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
