class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] result=new int[nums.length];
        int pos=nums.length-1;
        while(left<=right){
            int leftVal=nums[left]*nums[left];
            int rightVal=nums[right]*nums[right];
            if(leftVal>rightVal){
                result[pos]=leftVal;
                left++;
            }
            else{
                result[pos]=rightVal;
                right--;
            }
            pos--;
        }
        return result;
    }
}
