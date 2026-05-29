class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int arr=nums[i];
            int sum=0;
            arr=Math.abs(arr);
            while(arr>0){
                sum+=arr%10;
                arr=arr/10;
            }
            nums[i]=sum;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
