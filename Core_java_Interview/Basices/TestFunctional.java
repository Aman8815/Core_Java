package Basices;

public class TestFunctional {
    public static void main(String[] args) {
        
         FanctionalInterface f = new FanctionalInterface() {
            @Override
            public int sum(int a, int b) {
                // TODO Auto-generated method stub
                return a+b;
            }
         };

         int a = 15;
         int b=10;

         System.out.println(f.sum(a, b));

         FanctionalInterface.sub(a, b);
         f.multi(a, b);
    }
}
