import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n1 = new BigInteger(bufferedReader.readLine());
        BigInteger n2 = new BigInteger(bufferedReader.readLine());
        bufferedReader.close();
        
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
