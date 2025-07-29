package Basices;

public class noteCount {
     public static void main(String[] args) {
        
          int count =0,amount = 13250;
          int temp = 0;
          int arr[] = {500,200,100,50,20,10,5,2,1};

          for(int i=0;i<arr.length;i++){
              temp = arr[i];
                  count = amount/arr[i];
                  if(count>0){
                    System.out.println(count+"= "+arr[i]);
                  }
                  amount = amount%arr[i];
 
               
          
              
          }
     }
}
