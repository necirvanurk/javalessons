package javaclass14;

public class OddsAndEven {
    //write a method that takes an int value if that value is even that method
    //returns true otherwise it returns false

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

            //write a method that takes and returns true if number of characters in that String
            // are even otherwise odd
            boolean checkString(String str){
                if(str.length()%2==0) {
                    return true;
                }else {
                    return false;

                }


            }
    public static void main(String[] args) {
        OddsAndEven md=new OddsAndEven();
        System.out.println(md.isEven(3));
        System.out.println(md.checkString("hello"));

    }

    }
