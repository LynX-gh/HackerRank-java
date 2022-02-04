import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if( a.length() != b.length()){
            return false;
        }
        else{
            a.toLowerCase();
            b.toLowerCase();
            
            char arr_A[] = a.toCharArray();
            char arr_b[] = b.toCharArray();
            
            Arrays.sort(arr_A);
            Arrays.sort(arr_B);
            
            if(arr_A == arr_B){
                return true;
            }
            else{
                return false;
            }
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
