package javaclass14;

public class StringThatManyTimesInt {
    public static void main(String[] args) {
        StringThatManyTimesInt md=new StringThatManyTimesInt();
        System.out.println(md.sumNumbers(10,10));
        md.printManyTimes("java",3);
    }
    //write a method that takes a String and an int printsout  that string on the console
    //that many times that value that we csn in int
    int sumNumbers(int num1,int num2){
        return num1+num2;
    }
    void printManyTimes(String str,int times){
        for(int i=0;i<times;i++){
            System.out.println(str);
        }
    }
}
