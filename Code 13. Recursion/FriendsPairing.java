public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }
    public static int friendspairing(int n){
        //Base Case
        if (n==1 || n==2) {
            return n;
        }

        //Single
        int fnm1 = friendspairing(n-1);

        // Pair
        int fnm2 =(n-1) * friendspairing(n-2);
        //How many |^| no of pairs are Possible
        
        return fnm1 + fnm2 ;
    }
}
