public class Solution {
    public static int salary;

    public static void add(int increase) {
        salary += increase;
    }
    public static void main(String[] args) {
        Solution.add(100500);
        System.out.println(salary);
    }
}