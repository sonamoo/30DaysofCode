import java.util.Scanner;

public class Solution {

   public static void main(String[] args) {
        int sum;
        int hourglassIndex = 0;
        int largestNumber;
        int[] hourglass = new int[16];
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        for(int i= 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        // Read hourglass
        for(int i = 0; i < 4; i++) {
            for(int j=0; j < 4; j++, hourglassIndex++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] 
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                hourglass[hourglassIndex] = sum;
            }
        }
        
        largestNumber = hourglass[0];
        for(int a = 0; a < 16; a++){
            if (hourglass[a] > largestNumber) {
                largestNumber = hourglass[a];
            }
        }
        System.out.println(largestNumber);
    }
    
}