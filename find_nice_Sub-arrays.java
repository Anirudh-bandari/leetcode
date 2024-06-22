class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int count = 0;

        // Outer loop picks the starting index
        for (int start = 0; start < nums.length; start++) {
            // Inner loop picks the ending index
            for (int end = start ; end < nums.length; end++) {
                // Extract subarray
                int[] subarray = Arrays.copyOfRange(nums, start, end + 1);
                // Count subarray if length is >= 3 and it has exactly one odd number
                if (subarray.length >= k && countOddNumbers(subarray) == k) {
                    count++;
                }
            }
        }

        return count;
    }
     private static int countOddNumbers(int[] subarray) {
        int count = 0;
        for (int num : subarray) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
