import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String reverseA = A.substring(A.length()-1);
        
        for(int i = A.length()-2; i >= 0; i--){
            
            reverseA += A.charAt(i);
        }
        // System.out.println(reverseA);
        // System.out.println(A);
        if (A.equals(reverseA)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}




