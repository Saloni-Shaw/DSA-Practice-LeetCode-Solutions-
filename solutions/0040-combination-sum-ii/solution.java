class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        solve(0,candidates,target,current,result);
        return result;
    }
    public void solve(int index,int[]candidates,int target,List<Integer>current,List<List<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        if(index==candidates.length){
            return;
        }
        if(candidates[index]>target){
            return;
        }
    current.add(candidates[index]);

    solve(index+1,candidates,target-candidates[index],current,result);

    current.remove(current.size()-1);

    while(index+1<candidates.length && candidates[index]==candidates[index+1]){
        index++;
    }

    solve(index+1,candidates,target,current,result);
}
}
