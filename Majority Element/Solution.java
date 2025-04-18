class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set new candidate
            }
            count += (num == candidate) ? 1 : -1; // Vote or cancel out
        }

        return candidate;
    }
}
