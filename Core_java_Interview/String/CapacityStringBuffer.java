package String;

public class CapacityStringBuffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer(20);
        sb.append("Yash asmfnuif asjcnasjfh askjjnassfh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
