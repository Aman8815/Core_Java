package String;

public class Reverse {
    public static void main(String[] args) {
        String name = "Amanyashona";

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
