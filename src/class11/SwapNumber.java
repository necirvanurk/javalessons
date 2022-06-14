package class11;

public class SwapNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Write a program to swap 2 numbers without a temporary variable?
        int a=100;
        int b=200;

        a=a+b; //10+20=>30
        b=a-b; //30-20=>10;
        a=a-b;  //30-10 =>20
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}