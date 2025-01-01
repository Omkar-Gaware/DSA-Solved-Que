public class submaxsum {
    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        maxsum(number);
    }
    public static void maxsum(int number[]){
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                int currentsum= (i==0)? prefix[j]: prefix[j] - prefix[i-1];
                
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
               
            }
           }
          System.out.println("MAx sum is :"+maxsum);
        }
        
    }
