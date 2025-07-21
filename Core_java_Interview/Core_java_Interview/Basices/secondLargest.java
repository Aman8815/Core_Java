package Basices;

public class secondLargest {
    public static void main(String[] args) {
        
         int arr[] = {1,10,3,4,5,13};

         int count =0;
         int temp = 0;

         for(int i=0;i<arr.length;i++){

            if(temp<arr[i]){
                count = temp;
                temp = arr[i];
            }

            if(count<arr[i]&&temp>arr[i]){
                count = arr[i];
            }
         }

         System.out.println(count);
    }
}
