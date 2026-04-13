class Solution {
    public int maximumDifference(int[] nums) {
        int maxProfit=-1;
        int left=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int diff=-1;
            if(nums[i]<left){
                left=nums[i];
            }
            diff=nums[i+1]-left;
                if(diff>maxProfit){
                maxProfit=diff;
            }
        }
         if(maxProfit==0){
            return -1;
         }
         else{
            return maxProfit;
         }
    }
}
