package String;

public class Vowels {
    public static void main(String[] args) {
         
         String name = "aman";
         int count = 0;
         for(int i=0;i<name.length();i++)    {
           
             char ch = name.charAt(i);
             

             if(ch == 'a'|| ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
                  count ++ ;
             }

         }
         System.out.println(count);
         }
    }

