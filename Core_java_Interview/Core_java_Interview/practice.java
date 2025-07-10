public class practice {
  public static void main(String[] args) {
		
 StringBuffer sb = new StringBuffer("aman");

 for(int i=0;i<sb.length();i++){
  char ch = sb.charAt(i);

  if(ch==sb.charAt(0)){
    System.out.print(Character.toUpperCase(ch));
  }
  else{
    System.out.print(ch);
  }
 }
  
		
 }}

