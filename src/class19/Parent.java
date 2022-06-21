package class19;

public class Parent {
    String name="mishe";
    double money=10000;
}
class Child extends Parent{
    void printinfo(){
        System.out.println("My full name is necc"+name);
    }
    void buyCar(){
        System.out.println("with the gambels money "+money );
    }
    class Tester{
        public static void main(String[] args) {
            Child child=new Child();
            child.printinfo();
        }
    }


}
