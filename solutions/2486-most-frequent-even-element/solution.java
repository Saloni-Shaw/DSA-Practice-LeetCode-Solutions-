class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int maxFreq=0;
        int result=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count=1;
                while(i+1<nums.length && nums[i]==nums[i+1]){
                    count++;
                    i++;
                }
                if(count>maxFreq ||(count==maxFreq && nums[i] < result)){
                    maxFreq=count;
                    result=nums[i];
                }
            }
        }
        return result;
    }
}
