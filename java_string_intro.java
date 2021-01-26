import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // String.length() will return a int length of the string
        int add_string = A.length() + B.length();
        System.out.println(add_string);
        
        
        //Same as an if and else statement
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(capA + " " + capB); 
        
    }
}
