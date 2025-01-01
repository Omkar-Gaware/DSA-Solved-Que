import java.util.*;

public class D_max_leng_chain_pair {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 40 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainleng = 1;
        int pairEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > pairEnd) {
                chainleng++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println(chainleng);
    }
}