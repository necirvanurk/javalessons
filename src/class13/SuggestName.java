package class13;

public class SuggestName {
    public static void main(String[] args) {
        /*
        write a program that reads teo people's first
        names and if they expecting boy or girl?
        Based on the input suggest a name for a baby:

        example Output:
        Mom's first name ? Mary
        Dad's First name? Daniel
        Boy or Girl? boy
        suggested baby name : DANRY

        Example Output:
        MOm's first name? Mary
        Dad's first name ? Daniel
        Boy or Girl? girl
        suggested baby name: MAIEL
         */
        String father="Sameer";
        String mother="Taylor swift";
        boolean boy=!true;  // if true boy otherwise girl

        if(boy){
            String firstHalf=father.substring(0,father.length()/2);
            String secondHalf=mother.substring(mother.length()/2);
            System.out.print(firstHalf.trim()+secondHalf.trim());
        }else{
            String firstHalf=mother.substring(0,mother.length()/2);
            String secondHalf=father.substring(father.length()/2);
            System.out.print(firstHalf.trim()+secondHalf.trim());

        }
    }
}
