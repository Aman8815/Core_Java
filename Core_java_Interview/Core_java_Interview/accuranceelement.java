
 import java.sql.Array;
import java.util.Arrays;

public class accuranceelement {

	public static void main(String[] args) {
       
		 String s1 = "jar";
		 String s2 = "raj";

		 char[] ar1 = s1.toCharArray();
         char[] ar2 = s2.toCharArray();

		 Arrays.sort(ar1);
		 Arrays.sort(ar2);

		 if(Arrays.equals(ar1,ar2)){
			System.out.println(s1 +" and " +s2 + "  Is anagram");
		 }
		 else{
			System.out.println(s1+"and"+s2+"is not anagram");
		 }

	}

}
