package class19;

public class ReverseStringBuilder {
    /*
    Create a method that will accept an array as parameters and
     will return a sum of all elements from that array.
     Method should be visibly only within same package
     and accessible by the creating an instance of the class.
     */

    public static String reversString(String str){
        return  new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {

        System.out.println(ReverseStringBuilder.reversString("Monday"));
    }


}
