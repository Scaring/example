public class App {
    public static void main(String[] args) {
        // Window window = new Window();
        // window.printSize();
        // window.changeSize(4, 5);
        // window.printSize();
        int a = 255;
        int b = -255;

        System.out.println(convertIntegerToBinary(b));
    }

    public static String convertIntegerToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }
}