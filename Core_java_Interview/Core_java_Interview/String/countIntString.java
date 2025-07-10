package String;

public class countIntString {
    public static void main(String[] args) {
        String[] name = {"aman8815" , "Yashona3485"};
       int count = 0;
        for(String s : name){
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    count++;
                }
            }
        }
        System.out.println("Count =>"+count);

        int arr[] = new int[count];

        int index = 0;
        for(String s : name){
            for(int i =0 ;i< s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    arr[index] = Character.getNumericValue(s.charAt(i));
                    index++;
                }
            }
        }

        for(int s:arr){
            System.out.print(s+",");
        }

        
    
    }
}
