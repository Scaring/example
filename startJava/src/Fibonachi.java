public class Fibonachi {
    public static void main(String[] args) {
        int numOfFib = 20;
        for(int i = 0; i <= numOfFib; i++){
            int fib = fibonachi(i);

            if (i == numOfFib){
                System.out.print(fib + " ");
                break;
            }
            
            System.out.print(fib + " ");
        }
    }

    static int fibonachi(int n){
        if (n == 0) return 0; 
        if (n == 1) return 1;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}
