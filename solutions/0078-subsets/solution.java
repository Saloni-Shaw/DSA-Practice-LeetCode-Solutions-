class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
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
        //recursion
        solve(index+1,nums,current,result);
        //Backtrack
        current.remove(current.size()-1);
        solve(index+1,nums,current,result);
    }
}
