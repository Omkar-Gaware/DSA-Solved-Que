import java.util.*;
public class ContainMoreWater { // 0(n^2)
    public static int MaxWtaerStored(ArrayList<Integer> height){
        int maxwater = 0;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int H = Math.min(height.get(i), height.get(j));
                int W = j-i;
                int currentwater = H * W;

                maxwater = Math.max(maxwater, currentwater);
            }
        }
        return maxwater;
    }
    public static int MaxWataerStored(ArrayList<Integer> height){
        int LP = 0;
        int RP = height.size() -1;
        int maxwater = 0;

        while (LP<RP) {
            // Calculate Max Water 
            int HT = Math.min(height.get(LP), height.get(RP));
            int WD = RP - LP;
            int WaterStored = HT * WD;
            maxwater = Math.max(maxwater, WaterStored);

            // Updation
            if (height.get(LP) < height.get(RP)) {
                LP++;
            }else{
                RP--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        // 0(n^2)
        System.out.println(MaxWtaerStored(list));
        // By using two pointer Approatch
        // 0(n)
        System.out.println(MaxWataerStored(list));
    }
}
