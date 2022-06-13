package javaclass14;

public class StringandStringbuildier {
    public static void main(String[] args) {
        String s=new String("hahhaha");
        System.out.println(s.toUpperCase());
        StringBuilder st=new StringBuilder("jajajaj");
        System.out.println(st.reverse());
        // String and StringBuilder both are classes that we can use to store
        // and manipulate characters But Sting is immutable and String builder i mutable
        // when we make a lot of changes to a String it creates multiple copies inside your memory and it  can be very slow
        //because of this reason because for every change a new variable is created


    }
}
