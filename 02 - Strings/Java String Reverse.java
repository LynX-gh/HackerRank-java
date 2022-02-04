import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = "";
        char ch;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0; i<A.length(); i++){
            ch = A.charAt(i);
            rev = ch+rev;
        }
        System.out.println(A.equals(rev)?"Yes":"No");
    }
}
