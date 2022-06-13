package reviewclassObjectAndClass;

public class Student {

    //define attributes/fields = variables
    String name, lastName, address;
    int studentId,age;
    char grade;

    //define behavior = methods

    void study(){
        System.out.println(name+" is studying");
    }
    void doHomework(){
        System.out.println(name+" is doing homework");
    }
    //create a method that will return full name of uppercase
    String getFullName() {
        return name.toUpperCase() + " " + lastName.toUpperCase();
    }
    //create a method to print
    //full info of a student (full name+age+id+address)
    void printInfo(){
        System.out.println(name+" "+lastName+" is "+age+" and  lives in "+address);
    }
    /*
    *create a method that will reeturn wether student
    * is great, good,bad or  avarage
    * based on the grade
     */
    String rating(){
        switch (grade){
            case 'A':
                return "great";
            case 'B':
                return "good";
                case 'C':
                return "avarage";
                default:
                return "bad";




        }
    }

}
