class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] result=new int[k];
        for(int round=0;round<k;round++){
            int maxCount=-1;
            int bestNumber=0;
            for(int num:map.keySet()){
                int currentCount=map.get(num);
                if(currentCount>maxCount){
                    maxCount=currentCount;
                    bestNumber=num;
                }
            }
            result[round]=bestNumber;
            map.put(bestNumber,0);
        }
        return result;
    }
}
