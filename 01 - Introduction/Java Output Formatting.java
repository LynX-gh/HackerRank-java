import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        int i = 3;
        while(i>0){
            String s = scanner.next();
            int n = scanner.nextInt();
            i--;
            System.out.printf("%-15s%03d\n", s, n);
        }
        System.out.println("================================");
    }
}
