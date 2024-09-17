// Import necessary classes
import java.util.Arrays;

class Solution {
    // Function to get the minimum difference
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        // Edge case: If the array has only one element, the difference is always 0
        if (n == 1) {
            return 0;
        }

        // Sort the array
        Arrays.sort(arr);

        // Initialize result as the difference between the maximum and minimum elements
        int result = arr[n-1] - arr[0];

        // Initialize the smallest and largest values
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        // Traverse the array, calculating the minimum difference
        for (int i = 1; i < n; i++) {
            // Skip if subtracting k makes the element negative
            if (arr[i] - k < 0) continue;

            // Calculate the maximum and minimum possible values
            int max = Math.max(largest, arr[i-1] + k);
            int min = Math.min(smallest, arr[i] - k);

            // Update result if a smaller difference is found
            result = Math.min(result, max - min);
        }

        // Return the final result
        return result;
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 15, 10};
        int k = 6;
        int result = solution.getMinDiff(arr, k);
        System.out.println("Minimum difference is: " + result);
    }
}
