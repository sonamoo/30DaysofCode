import java.util.Arrays;
import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	public Difference(int[] a){
        elements = a;
    }

    public int computeDifference() {
        int index = 0;
        int diff;
        int max = Math.abs(this.elements[0] - this.elements[1]);
        for (int i = 0; i < this.elements.length-1; i++) {
            for (int j = i+1; j < this.elements.length; j++, index++) {
                diff = Math.abs(this.elements[i] - this.elements[j]);
                if (max < diff ) {
                    max = diff;
                }
            }
        }
        this.maximumDifference = max;
        return maximumDifference;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}