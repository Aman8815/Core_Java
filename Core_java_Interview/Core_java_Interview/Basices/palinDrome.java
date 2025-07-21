package Basices;

public class palinDrome {
    public static void main(String[] args) {
        
        int num = 121;
        int count  =0;
        int r = 0;
        int num2 = num;
        while(num2>0){
            r = num2%10;
            count = count*10+r;
            num2 = num2/10;
        }

        if(count==num){
            System.out.println("ITs Palindrome Number");
        }
        else{
            System.out.println("Its not Palindrome Number");
        }
    }
}
