import java.util.Scanner;


public class reversearray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the array size");
         int size = sc.nextInt();

         int arr[] = new int[size];

         System.out.println("Enter the array element");
         for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
         }
        System.out.println("Your array element is =");
         for(int i =0;i<size;i++){
            System.out.println(arr[i]);
         }

         System.out.println("the reverse in array");
         for(int i=0; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
         }
         for(int i =0;i<size;i++){
            System.out.println(arr[i]);
         }


    }
}
