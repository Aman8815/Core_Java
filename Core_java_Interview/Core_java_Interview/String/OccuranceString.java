package String;

public class OccuranceString {
    public static void main(String[] args) {
        
        String name = "deepake";
        int count = 0;
        for(int i = 0; i<name.length();i++){
            char s = name.charAt(i);

            String m = String.valueOf(s);

            if(m.matches("e")){
                count++;
            }
        }

        System.out.println("E=>"+count);
    }
}
