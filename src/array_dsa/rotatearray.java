package array_dsa;

public class rotatearray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k > n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

