package class13;

public class MiddleNumber {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
         */
        String str=new String("hello");
        String str2="hello"; // This is preferred

        if(!str2.isEmpty()){
            if(str2.length()%2!=0&&str2.length()>=3){
                int middle=str2.length()/2;
                System.out.println(str2.charAt(middle));
            }

        }
    }
}
