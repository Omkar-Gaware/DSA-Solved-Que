public class BinomailCoe {
    public static void main(String[] args) {
        System.out.println(Binomial(5, 2));
    }
    public static int Binomial(int n, int r){
        int n_fact = Factorials(n);
        int r_fact = Factorials(r);
        int n_r_fact = Factorials(n-r);

        int nCr = n_fact/ (r_fact * n_r_fact);

        return nCr;
    }
    public static int Factorials(int n){
        int fact=1;
        for(int i=1; i<= n; i++){
            
            fact= fact * i;
        }
        return fact;
    }
}
