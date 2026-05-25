class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidates=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidates=nums[i];
                count+=1;
            }
            else if(nums[i]==candidates){
                count++;
            }
            else{
                count--;
            }
        }
        return candidates;
    }
}
