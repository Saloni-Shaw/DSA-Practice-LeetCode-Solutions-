class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        Set<Integer>intersectionSet=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                intersectionSet.add(nums2[i]);
            }
        }

        int[]result=new int[intersectionSet.size()];
        int index=0;
        for(int num:intersectionSet){
            result[index]=num;
            index++;
        }
        return result;
    }
}
