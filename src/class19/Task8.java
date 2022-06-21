package class19;

import org.w3c.dom.ls.LSOutput;

public class Task8 {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given  student using displayInfo method
     */
    static String name;
    static String address;

    Task8(String name,String address){
        this.name=name;
        this.address=address;
    }
     static void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Task8 task8=new Task8("necc","970 alice ln");
        Task8.displayInfo();
    }




}
