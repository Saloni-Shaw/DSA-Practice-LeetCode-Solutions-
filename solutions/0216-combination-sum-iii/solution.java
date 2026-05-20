class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        solve(1,k,n,current,result);
        return result;
    }
    public void solve(int start,int k,int n,List<Integer>current,List<List<Integer>>result){
        if(k==0 && n==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(n<0){
            return;
        }
        if(k<0){
            return;
        }
        if(start>9){
            return;
        }
        for(int i=start;i<=9;i++){
            current.add(i);
            solve(i+1,k-1,n-i,current,result);
            //Backtrack
            current.remove(current.size()-1);
        }
        
    }
}
