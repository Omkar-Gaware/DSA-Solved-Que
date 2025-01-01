import java.util.Arrays;

public class C_Absolute_Difference {
    public static void main(String[] args) {
        int A[] = { 1, 5, 7 };
        int B[] = { 5, 4, 2 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minabs = 0;

        for (int i = 0; i < A.length; i++) {
            minabs += Math.abs(A[i] - B[i]);
        }

        System.out.println(minabs);
    }
}
