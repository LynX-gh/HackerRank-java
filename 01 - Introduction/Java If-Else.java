import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n>1 && n<6){
            System.out.println("Not Weird");
        }
        else if(n>5 && n<21){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
