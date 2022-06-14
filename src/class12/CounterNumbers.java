package class12;


public class CounterNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "1234574861425411";

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
