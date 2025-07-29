package Basices;

@FunctionalInterface
public interface FanctionalInterface {
    public int sum(int a , int b);

    public static void sub(int a,int b){

        System.out.println(a-b+"sub");
    }

    public default void multi(int a ,int b){
        System.out.println(a*b);
    }

    
} 
