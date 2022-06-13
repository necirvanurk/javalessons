package javaclass14;

public class HowManySentences {
    public static void main(String[] args) {
        String str="Is it saturday? Is it raining? Do we have a Java class today? I went outside.I put my phone on charge!";
        System.out.println(str.split("[?.!]").length);
    }
}
