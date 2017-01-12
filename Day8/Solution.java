import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Map<String, String> phoneBook = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            phoneBook.put(name, phone);   
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+phoneBook.get(s));
            }
        }
        in.close();
    }
}