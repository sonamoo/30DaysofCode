import java.util.Scanner;


public class Solutions {
    
 
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int ii = scan.nextInt();
        double dd = scan.nextDouble();
        scan.nextLine();
        String sd = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/

        /* Print the sum of both integer variables on a new line. */
        
        System.out.println(i + ii);
        System.out.println(d + dd);
        System.out.println(s + sd);

        scan.close();
    }
    
}
