public class practice {
  public static void main(String[] args) {
		
  StringBuffer sb = new StringBuffer("Aman");

   sb.append("Yashona");
   System.out.println(sb);

   System.out.println(sb.length());
   System.out.println(sb.capacity());
   System.out.println(sb.charAt(6));
   System.out.println(sb.indexOf("s"));
   System.out.println(sb.replace(0, 4, "nman"));
   System.out.println(sb.reverse());
    
   
		
 }
}
