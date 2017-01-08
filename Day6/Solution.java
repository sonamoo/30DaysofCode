import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numberOfString = Integer.parseInt(input.next());
        for (int i = 0; i < numberOfString; i++) {
            String stringLine = input.next();
            char[] stringArray = stringLine.toCharArray();
            for (int j =0; j < stringLine.length(); j+=2) {
                System.out.print(stringArray[j]);
            }
            System.out.print(" ");    
            for (int j =1; j < stringLine.length(); j+=2) {
                System.out.print(stringArray[j]);
            }
            System.out.println("");
        }
    }
}