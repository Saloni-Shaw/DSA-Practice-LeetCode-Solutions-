class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> resultList=new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            int currentNum=nums2[i];
            if(map.containsKey(currentNum) && map.get(currentNum)>0){
                resultList.add(currentNum);
                map.put(currentNum,map.get(currentNum)-1);
            }
        }
        int[]result=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            result[i]=resultList.get(i);
        }
        return result;
    }
}
