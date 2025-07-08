public class matrix4 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 7; j >=1; j--) {
                int a = 4+i-1;  //4  //5
                int b = 4+1-i;  //4   //3
                
                if (j > a && j < b) {    //1<4 && 1>4  //2<5 &&  2>3
                   System.out.print("");
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
