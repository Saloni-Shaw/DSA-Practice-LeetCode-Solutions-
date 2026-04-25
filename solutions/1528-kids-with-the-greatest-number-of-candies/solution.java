class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        boolean[] arr=new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if(sum>=max){
                arr[i]=true;
            }
            else{
                arr[i]=false;
            }
        }
        List <Boolean> result=new ArrayList<>();
        for(boolean b: arr){
            result.add(b);
        }
        return result;
    }
}
