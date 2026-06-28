class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();

        for(int num:set1){
            if(!set2.contains(num)){
                ans1.add(num);
            }
        }
        for(int num:set2){
            if(!set1.contains(num)){
                ans2.add(num);
            }
        }
        return Arrays.asList(ans1,ans2);
    }
}
