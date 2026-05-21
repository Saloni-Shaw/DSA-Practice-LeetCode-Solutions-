class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>current=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        solve(0,nums,current,result);
        return result;
    }
    public void solve(int index,int[]nums,List<Integer>current,List<List<Integer>>result){
        //Base condition
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        //choice 1
        current.add(nums[index]);
        solve(index+1,nums,current,result);
        //Backtrack 
        current.remove(current.size()-1);
        //skip duplicates 

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        solve(index+1,nums,current,result);
    }
}
