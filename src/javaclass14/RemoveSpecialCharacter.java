package javaclass14;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters ,
        numbers and special characters. find out how many Alphanumeric
        characters are there in the Stirng
         */
        String str="ajfhhdhf343455*^&%^%&";
        System.out.println(str.replace("^A-Za-z0-9","").length());
    }
}
