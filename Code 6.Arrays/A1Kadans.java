public class A1Kadans {
    // Very Imp
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int maxsum=Integer.MIN_VALUE;
        int minsum=0;

        for(int i=0; i<array.length; i++){
            minsum+=array[i];
            if (minsum<0) {
                minsum = 0;
            }
            maxsum = Math.max(minsum,maxsum);
        }
        System.out.println("Maximum Sum of given numbers is :"+maxsum);
    }
}
