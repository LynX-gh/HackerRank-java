import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double d = scanner.nextDouble();
        String s = scanner.nextLine();
        s = scanner.nextLine();
        scanner.close();
        
        System.out.println("String: "+ s +"\nDouble: "+ d +"\nInt: " + n);
    }
}
