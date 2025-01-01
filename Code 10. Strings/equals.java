public class equals {
    public static void main(String[] args) {
        String s1 = "Omkar";
        String s2 = "Omkar";
        String s3 = new String("Omkar");

        if(s1 == s2){
            System.out.println("Are equals");
        }
        else{
            System.out.println("Not equals");
        }
        if(s1 == s3){
            System.out.println("Are equals");
        }
        else{
            System.out.println("Not equals");
        }
        // Special equals() function
        if (s1.equals(s3)) {
            System.out.println("Are equals");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
