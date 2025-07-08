public class complex {
     
    static void linearTime(){
        // increase will be array size so increse will be time 
        int arr[] = {1,2,3,4,5,56,650};

        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);//O(n)
        }
    }
    
    static void constentTime(){
        // the constent time is jo directly index par jata the not matter a array size
        int arr[] = {1,2,3,4,5,56};

        System.out.println(arr[0]); //O(1)
    }

    public static void main(String[] args) {
        //constentTime();
        linearTime();
    }
}
