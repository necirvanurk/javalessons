package class13;

public class StirngDemo2 {
    public static void main(String[] args) {
        String str="jnfjdsf43434knnGHUDFJNDFDF64637346jhdsdhjesjhfh4454";
        System.out.println(str.replaceAll("[0-9]","#"));//jnfjdsf#####knnGHUDFJNDFDF########jhdsdhjesjhfh####
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));//###################################################
        System.out.println(str.replaceAll("[^a-z]","_"));//"^a-z"mean replace everything except this //jnfjdsf_____knn_____________
        System.out.println(str.replaceAll("[^A-z]",""));//Remove the special characters




    }
}
