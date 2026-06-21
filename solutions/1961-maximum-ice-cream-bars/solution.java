class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=costs[0];
        for(int i=0;i<costs.length;i++){
            if(costs[i]>max){
                max=costs[i];
            }
        }
        int[] counts=new int[max+1];
        for(int i=0;i<costs.length;i++){
            int price=costs[i];
            counts[price]=counts[price]+1;
        }
        int targetIndex=0;
        for(int price=0;price<=max;price=price+1){
            while(counts[price]>0){
                costs[targetIndex]=price;
                targetIndex=targetIndex+1;
                counts[price]=counts[price]-1;
            }
        }
        int count=0;
        for(int i=0;i<costs.length;i++){
            if(coins>=costs[i]){
                coins=coins-costs[i];
                count+=1;
            }
            else{
                break;
            }
        }
        return count;
    }
}
