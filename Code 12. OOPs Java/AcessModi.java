public class AcessModi {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.username = "Omkar";
        /*acc.password;*/ // We can't acess the password
        acc.setpassword("abcde");
      }
}
class Account{
    public String username;
    private String password;

    public void setpassword(String pwd){
        password = pwd;
    }
    public String getPassword() {
        return password;
    }
}
