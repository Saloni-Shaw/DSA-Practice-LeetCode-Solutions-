class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=left+1;
        int count=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
            }
            else if (nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
                right++;
                count++;
            }
        }
        return count;
    }
}
