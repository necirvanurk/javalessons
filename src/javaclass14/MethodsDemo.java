package javaclass14;

import java.util.Scanner;

public class MethodsDemo {
    public boolean sumNumbers;

    // method is a block of cod a group of java statements that are group together and
    // we can execute those satements buy just creating an object of the class that contains
    //that method and by writing the object name .method  name
        void printHello() {
            System.out.println("How are you guys");

        }

        boolean returnTrue(){
            return true;
        }
        int returnInt() {
            return 10;
        }

  /// method that return something and Methods that don't return something
    public static void main(String[] args) {
        MethodsDemo md=new MethodsDemo();
        md.printHello();
        boolean ex=md.returnTrue();// when we write this always true will be stored

        int num=md.returnInt();
        System.out.println(num);//10
        System.out.println(md.returnInt());
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();
    }



}
