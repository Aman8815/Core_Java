package Basices;

public class notCount {
    public static void main(String[] args) {
         int arr[] = {500,200,100,50,20,10,5,2,1};
    int temp =0;
    int count = 0;
    int amount = 13250;
    for(int i=0;i<arr.length;i++){
      temp = arr[i];
    
        count = amount/temp;
        if(count>0){
        System.out.println(count+" = "+temp);
        }
        amount = amount%temp;
      }
    }
  
    }

