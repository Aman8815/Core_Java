package Basices;
public class pactice {
    public static void main(String[] args) {
         
        int arr[] = {1,2,4,3,5,6};
        int temp=0,count=0;

        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                    
                    count = temp;
                    temp = arr[i];
                if(count<arr[i] &&temp>arr[i] ){
                    count =arr[i];
                }
            }
        }

        System.out.println(count);
    }
}
