package Basices;

public class armString {
    public static void main(String[] args) {
        int num = 153;
        int count = 0,r = 0;
        int num2 = num;

        while(num2>0){
            r = num2%10;
            count = count+(r*r*r);
            num2 = num2/10;
        }

        if(num==count){
            System.out.println("its armstrong number");
        }
        else{
            System.out.println("Its not armstring number");
        }
    }

}
