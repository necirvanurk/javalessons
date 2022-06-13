package javaclass14;

public class Recap {
    public static void main(String[] args) {
        String str="i never forget about recording";
        System.out.println(str.replace("never","always"));

        str="jfdfhsdfhfjk213434545)(*&&^&";
        System.out.println(str.replaceAll("[0-9]",""));

        String str2="Batch 13 is Great.Batch 13 is Best. Batch  13 is excellent";

        String [] arr=str2.split("[.]");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        str="WE #love# java";
        String[] arr2=str.split("[#]");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);





    }
}
