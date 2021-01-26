import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String us = nf.format(payment);
        System.out.println("US: " + us);
        
        Locale india_local = new Locale("en", "IN");
        NumberFormat nf_i = NumberFormat.getCurrencyInstance(india_local);
        String india = nf_i.format(payment);
        System.out.println("India: " + india);
        
        Locale china_local = new Locale("zh", "CN");
        NumberFormat nf_c = NumberFormat.getCurrencyInstance(china_local);
        String china = nf_c.format(payment);
        System.out.println("China: " + china);
        
        
        Locale france_local = new Locale("fr", "FR");
        NumberFormat nf_f = NumberFormat.getCurrencyInstance(france_local);
        String france = nf_f.format(payment);
        System.out.println("France: " + france);
    }
}
