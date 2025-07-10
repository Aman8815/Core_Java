public class CountIntFromString {

    public static void main(String[] args) {

        String[] str = { "he22llo", "ram45n" };

        int count = 0;
        for (String s : str) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    count++;
                }
            }
        }
        System.out.println("total int: " + count);
        int[] intArray = new int[count];
        System.out.println("lenght of intArray: " + intArray.length);

        int index = 0;
        for (String s : str) {
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    intArray[index] = Character.getNumericValue(s.charAt(j));
                    index++;
                }
            }
        }

        for (int i : intArray) {
            System.out.println(i);
        }

    }

}
