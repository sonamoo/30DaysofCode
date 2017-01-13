import java.util.Scanner;

public class Solution {

    public static int findArraySize(int n) {
        int arraySize = 0;
        while(n >= 1) {
            n /=2;
            arraySize++;
        }
        return arraySize;   
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arraySize = findArraySize(n);
        int[] binaryNumber = new int[arraySize];

        for (int i = 0; i < binaryNumber.length; i++) {
            binaryNumber[i] = n%2;
            n /= 2;   
        }

        int ones = 1;
        int biggest = 1;

        for (int j = binaryNumber.length-1; j >= 1; j--) {
            if (binaryNumber[j] == 1 && binaryNumber[j-1] == 1) {
                ones++;
            } else {
                if (ones >= biggest) {
                    biggest = ones;
                    ones = 1;
                }
                if (binaryNumber[j]==0) {
                    ones = 1;
                }
            }
        }
       if (ones > biggest) {
            System.out.println(ones);
       } else {
            System.out.println(biggest);
       }
        
    }
}