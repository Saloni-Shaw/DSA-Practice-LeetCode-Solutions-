class Solution {
    public int compareBitonicSums(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int maxVal=nums[0];
        int peakIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxVal){
                maxVal=nums[i];
                peakIndex=i;
            }
        }
        // for(int i=1;i<=peakIndex;i++){
        //     if (nums[i]<=nums[i-1]){
        //         return -1;
        //     }
        // }
        // for(int i=peakIndex+1;i<nums.length;i++){
        //     if (nums[i]>=nums[i-1]){
        //         return -1;
        //     }
        // }
        long sum1=0;
        for(int i=0;i<=peakIndex;i++){
            sum1+=nums[i];
        }
        System.out.println(sum1);
        long  sum2=0;
        for(int i=peakIndex;i<nums.length;i++){
            sum2+=nums[i];
        }
        System.out.println(sum2);
        if(sum1==sum2){
            return -1;
        }
        else if(sum1>sum2){
            return 0;
        }
        else{
            return 1;
        }
    }
}
