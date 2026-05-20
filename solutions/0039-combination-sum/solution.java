class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Stores all valid combinations
        List<List<Integer>> result=new ArrayList<>();

        //Stores the current combination
        List<Integer>current=new ArrayList<>();

        //Start recursion from index 0
        solve(0,candidates,target,current,result);
        return result;
    }
    public void solve (int index,int[]candidates,int target,List<Integer>current,List<List<Integer>>result){
        //Base Case 1
        //If target becomes 0, we found a valid candidate
        if(target==0){
            result.add(new ArrayList<>(current));//Add a copy of current combination to result
            return;
        }
        //Base case 2
        if(target<0){     //If target becomes negative,this path is invalid
            return;
        }
        //Base Case 3
        if(index==candidates.length){
            return;
        }

        //Choice 1: Take Current number

        current.add(candidates[index]);

        //Stay at same index because we can reuse the same number
        solve(index,candidates,target-candidates[index],current,result);

        //Backtrack::remove the last added number 
        current.remove(current.size()-1);

        solve(index+1,candidates,target,current,result); 
    }
}
