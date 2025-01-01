public class Subarray {
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8};
        subarray(number);
    }
    public static void subarray(int number[]){
        int ts=0;
       for(int i=0; i<number.length; i++){
        for(int j=i+1; j<number.length; j++){
            for(int p=i; p<j; p++){
                System.out.print(number[p]+ " ");
            }
            ts++;
            System.out.println();
        }
        System.out.println(); 
       }
       System.out.print(ts);
    }
}
