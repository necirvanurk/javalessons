package reviewclassObjectAndClass;

public class School {
    public static void main(String[] args) {
      Student student1=new Student();
   //accessing variables of Student class
      student1.name="nicoo";
      student1.lastName="urek";
      student1.age=27;
      student1.address="970 alice ln";
      student1.studentId=368;
      student1.grade='A';

      Student student2=new Student();
      //accessing variables of Student class
      student2.name="rem";
        student2.lastName="ozer";
      student2.age=26;
      student2.address="970 alice ln";

      //accessing methods of Student class
      student2.study();
      student2.doHomework();

      student1.study();
      student1.doHomework();

      String fullName=student1.getFullName();
        System.out.println(fullName);
      System.out.println(student2.getFullName());

      student1.printInfo();
      student2.printInfo();

    }
}
