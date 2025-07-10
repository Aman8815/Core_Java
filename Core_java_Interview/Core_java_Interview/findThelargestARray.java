public class findThelargestARray {


    public  static int largestelement(int arr[]){
        int temp = arr[0];
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                 temp = arr[i+1];
            }
            
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,10,4,5};
        
      int largest = largestelement(arr);
      System.out.println("The largestelement is = "+largest);

    }
}
