import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Thearray size ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array  elements");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondlargest = arr[1];

        for(int i =1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            

        }
           else if(largest!=arr[i]&&secondlargest<arr[i])
                     secondlargest = arr[i];
            }
        
        System.out.println("the largestv ="+largest);
        System.out.println("The second largest = "+secondlargest);
    
    
    }
}
