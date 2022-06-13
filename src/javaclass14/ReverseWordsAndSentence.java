package javaclass14;

public class ReverseWordsAndSentence {
    public static void main(String[] args) {
        /*
        how would you reverse a Stirng word by word? for example
       // input => This is sentence i want to reverse
       //output=> sihT si ecnetnes i tnaw ot esrever
         */
        String str="This is sentence i want to reverse";
        String[] arr=str.split(" ");//split based on the space

        for(String s:arr){
            System.out.print(new StringBuilder(s).reverse()+" ");//reverse words but same position
        }
        System.out.println();
        System.out.println(new StringBuilder(str).reverse());//words and position reverse

    }
}
