public class spiral{
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int Startrow = 0;
        int Startcol = 0;
        int Endrow = array.length-1;
        int Endcol = array[0].length-1;

        while(Startrow<= Endrow && Startcol<= Endcol){
            //top
            for (int j = Startcol; j <= Endcol; j++) {
                System.out.print(array[Startrow][j]+" ");
            }
            //Right
            for(int i=Startrow+1; i<=Endrow; i++){
                System.out.print(array[i][Endcol]+" ");
            }
            //Bottom
            for(int j=Endcol-1; j>=Startcol; j--){
                if(Startrow==Endrow){
                    break;
                }
                System.out.print(array[Endrow][j]+" ");
            }
            //left
            for(int i=Endrow-1; i>=Startrow+1; i--){
                if(Startcol==Endcol){
                    break;
                }
                System.out.print(array[i][Startcol]+" ");
            }
            
            Startrow++;
            Startcol++;
            Endcol--;
            Endrow--;
        }
    }
}