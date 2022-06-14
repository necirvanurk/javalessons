package class13;

public class Recap2 {
    public static void main(String[] args) {
        String str="where is sammer?";
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(7));
        System.out.println(str.length());

        System.out.println(str.indexOf("e"));//execute first e character
        System.out.println(str.indexOf("e",6));// it will start execute after character 6
        int counter =0;
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)=='e') {
                counter++;
                if(counter==3) {
                    System.out.println(i);
                }
            }

        }




    }
}
