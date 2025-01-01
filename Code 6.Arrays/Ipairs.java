public class Ipairs {
    public static void main(String[] args) {
        int number[]= {2,3,4,5,6,7,8};
        pairs(number);
    }
    public static void pairs(int number[]){
        //pairs
         int totalpairs = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+number[i]+","+number[j]+")"+" ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs ="+ totalpairs);
    }
}
