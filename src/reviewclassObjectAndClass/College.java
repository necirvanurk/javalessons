package reviewclassObjectAndClass;

public class College {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="John";
        stu.lastName="martin";
        stu.address="miami";
        stu.age=23;
        stu.grade='C';
        stu.studentId=70;
        // accessing methods
        stu.study();
        stu.doHomework();

        //below 2 method have return Type - String
        System.out.println(stu.getFullName());
        stu.printInfo();
        String raiting=stu.rating();

        System.out.println(stu.name+" is "+raiting+" student");
    }
}
