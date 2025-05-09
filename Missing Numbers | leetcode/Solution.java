class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  // Sum of first 'n' natural numbers
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num; // Calculate actual sum of array elements
        }
        
        return expectedSum - actualSum; // The difference is the missing number
    }
}
