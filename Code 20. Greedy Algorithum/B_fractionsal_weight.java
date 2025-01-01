import java.util.*;

public class B_fractionsal_weight {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // assending sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal = 0;
 
        // but we want Decending order

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idex = (int) ratio[i][0];
            if (capacity >= weight[idex]) {
                finalVal += value[idex];
                capacity -= weight[idex];
            } else {
                finalVal += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }

        System.err.println("Final Value :" + finalVal);
    }
}
