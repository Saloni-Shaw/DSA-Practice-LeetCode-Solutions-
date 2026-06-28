class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length;
        for(int i=n-1;i>=n-k;i--){
            if(mul>0){
                sum+=(long)nums[i]*mul;
            }
            else{
                sum+=nums[i];
            }
            mul--;
        }
        return sum;
    }
}
