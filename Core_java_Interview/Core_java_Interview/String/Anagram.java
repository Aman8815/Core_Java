package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String s1 = "aman";
        String s2 = "nman";

        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2)){
            System.out.println("ITs anagram");
        }
        else{
            System.out.println("Its not anagram");
        }
    }
}
