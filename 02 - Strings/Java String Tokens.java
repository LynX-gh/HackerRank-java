import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        scan.close();
        
        if(s.length() > 0){
            String[] res = s.split("[ !,?._'@]+");
            System.out.println(res.length);
            for(int i = 0; i < res.length; i++){
                System.out.println(res[i]);
            }
        }
        else{
            System.out.println(0);
        }
    }
}