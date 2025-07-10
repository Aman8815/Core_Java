package String;

public class Dupliccate {
    public static void main(String[] args) {
        
        String  str = "yashona";
        char[] str1 = str.toCharArray();
      int   count =0;

            for(int i =0 ; i<str1.length;i++){
                count =1;
               for(int j = i+1;j<str1.length;j++){
                  if(str1[i]==str1[j]){
                    count++;
                  }
               }
               if(count>1){
                System.out.println(str1[i]);
                count = 0 ;
               }
            }
        }
    }

