package Basices;

public class lamdaTest {

    public static void main(String[] args) {
        
         FanctionalInterface f = (a,b) ->{
             return a+b;
         };

         int a = 20;
         int b = 30;

        System.out.println(f.sum(a, b));
        f.multi(a, b);
         FanctionalInterface.sub(a, b);
    }
    
}
