import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int numberOfSwaps = 0;        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps." );
        System.out.println("First Element: " + a[0] );
        System.out.println("Last Element: " + a[n-1]);
    }
}