public class SumOfDigits {
    public static void main(String[] args) {
        // int a = 5;
        System.out.println( false | true);

    }

    public static int sumOfDigits(int number) {
        Integer n = number;
        String[] s = n.toString().split("");

        int result = 0;

        for (int i = 0; i < s.length; i++) {
            result = result + Integer.parseInt(s[i]);
        }

        return result;
    }
}
