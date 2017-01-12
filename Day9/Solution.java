public class Solution {
    
    public static int Factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n*Factorial(n-1); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number = scanner.nextInt();
        System.out.println(Factorial(number));
    }
}