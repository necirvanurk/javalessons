package class13;

public class Recap {
    public static void main(String[] args) {

        String str="Bastch 13 is great but i says this to every batch.i was kidding";
        int len=str.length();
        System.out.println(str.toUpperCase());
        str=str.toUpperCase();
        System.out.println(str);
        str="";
        System.out.println(str.isEmpty());

        String str2="Tara                ";
        System.out.println(str2.trim());

        str="Bastch 13 is great but i says this to every batch.i was kidding";
        System.out.println(str.toLowerCase().contains("batch"));
    }
}
