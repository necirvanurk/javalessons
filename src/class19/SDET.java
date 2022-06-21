package class19;

public class SDET extends Human{
    boolean goodWithjava;
    SDET(String name,String eyesColor,String job,int age,boolean goodWithjava){
        this.name=name;//this name is coming from parent class Human
        this.eyesColor=eyesColor;
        this.job=job;
        this.age=age;
    }
    void printinfo(){
        System.out.println("My name is "+name+" i do "+job+" am i good with java "+goodWithjava);
    }

    public static void main(String[] args) {
        SDET me=new SDET("nico","hazel","try to be hacker",27,true);
        me.printinfo();
    }

}
