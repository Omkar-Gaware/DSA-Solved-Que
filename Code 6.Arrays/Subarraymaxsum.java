public class Subarraymaxsum {
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8};
        maxsum(number);
    }
    public static void maxsum(int number[]){
        int maxsum= Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                int currentsum=0;
                for(int p=i; p<j; p++){
                    currentsum+=number[p];
                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
               
            }
           }System.out.println("MAx sum is :"+maxsum);
          
        }
    }
