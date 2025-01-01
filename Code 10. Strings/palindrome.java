public class palindrome {
    public static void main(String[] args) {
        String name = "racecar";
        boolean omkar = true;
 
        //check for pelendrome
        for (int i = 0; i < name.length()/2; i++) {
            int n = name.length();
            if (name.charAt(i) != name.charAt(n-i-1)) {
                omkar = false;
                break;
            }
        }
        //result
        if (omkar==false) {
            System.out.println("Given Sting is not pelendrome");
        }else{
            System.out.println("Given Sting is a pelendrome");
        }
    }
}
