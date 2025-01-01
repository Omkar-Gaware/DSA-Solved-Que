public class Hreverse {
    public static void main(String[] args) {
        int number[]={10,20,30,40,50,60,70,80,90,100};

        reverse(number);
        for(int i=0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        
    }       // Swaping 
    public static void reverse(int number[]){
        int start=0;
        int end=number.length-1;

        while(start<end){
            int reverse = number[end];
            number[end]=number[start];
            number[start]=reverse;
            start++;
            end--;
        }
    }
}
