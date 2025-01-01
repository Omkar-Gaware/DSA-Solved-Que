public class Elinearsearch {
    public static int numbers(int numbers[],int num){

        for(int i=1; i<numbers.length; i++){
            if(numbers[i]== num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14,16,20};
        int num=16;
        int index = numbers(numbers, num);
        if (index==-1) {
            System.out.print("Not found");
        }else{
            System.out.println("Number is present at index  :"+index);
        }
    }
}
