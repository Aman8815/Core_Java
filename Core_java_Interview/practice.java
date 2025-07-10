public class practice {
  public static void main(String[] args) {
		
   String name = "aman";
    int count = 0;
   for(char a = 'a'; a<='z';a++){
    for(int i=0;i<name.length();i++){
      char ch = name.charAt(i);
      if(a==ch){
        count ++;
      }
    }
    if(count>0){
      System.out.println(a+"=>"+count);
      count = 0;
      
    }
   }
   

  
		
 }
}
