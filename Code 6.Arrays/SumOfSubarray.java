public class SumOfSubarray {

    // Function to find the maximum subarray sum using Kadane's algorithm
    public static int findMaxSubarraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    // Function to find the minimum subarray sum using Kadane's algorithm
    public static int findMinSubarraySum(int[] arr) {
        int minEndingHere = arr[0];
        int minSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        return minSoFar;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8};

        int maxSubarraySum = findMaxSubarraySum(array);
        int minSubarraySum = findMinSubarraySum(array);

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum);
        System.out.println("Minimum Subarray Sum: " + minSubarraySum);
    }
}
