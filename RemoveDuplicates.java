class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1; // number of unique elements
        
        for (int i = 1; i < nums.length; i++) {
            // If a new unique element is found
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // place it in correct position
                k++;
            }
        }
        
        return k;
    }
}
