import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        java.util.SortedSet<String> sets=new java.util.TreeSet<String>();
        for(int i = 0;i <= s.length()-k;i++){
            sets.add(s.substring(i,i+k));
        }
        // System.out.println(sets.first());
        // System.out.println(sets.last());
        
        smallest = sets.first();
        largest = sets.last();
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
