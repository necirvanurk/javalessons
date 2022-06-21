package hangout;


import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        String replaceAllString = givenString.replaceAll("\\s", "").toLowerCase();
        boolean result = false;
        int i = 0;
        int j = replaceAllString.length() - 1;
        while (i <= j) {
            if (replaceAllString.charAt(i) == replaceAllString.charAt(j)) {
                result = true;
            } else {
                break;
            }
            i++;
            j--;
        }
        System.out.println(result);
    }
}