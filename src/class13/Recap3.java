package class13;

public class Recap3 {
    public static void main(String[] args) {

        // from a String get the which starts from the symbol # and ends at the symbol #
        String str="i am confused";
        System.out.println(str.substring(5));// starting point after 5 everything will be executed
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(0,1));// starting and ending point all character between this two number will be executed

        str="Asghar is Great";
        System.out.println(str.substring(0,6));


    }
}
