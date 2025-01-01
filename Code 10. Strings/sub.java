public class sub {
    public static void main(String[] args) {
        String name = "Omkar";
        int num= 0;
        for (int i = 0; i < name.length(); i++) {
            for(int j=1; j< name.length(); j++){
            System.out.println("Substring is :"+name.charAt(i)+name.charAt(j));
            num++;
            }
            
        }
        System.out.println(num);
    }
}
