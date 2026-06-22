class Solution {
    public int rearrangeCharacters(String s, String target) {
            int[] sCounts=new int[26];
            int[] targetCounts=new int[26];
            for(int i=0;i<s.length();i++){
                sCounts[s.charAt(i)-'a']++;
            }
            for(int i=0;i<target.length();i++){
                targetCounts[target.charAt(i)-'a']++;
            }
            int minCopies=Integer.MAX_VALUE;

            for(int i=0;i<26;i++){
                if(targetCounts[i]>0){
                    int copies=sCounts[i]/targetCounts[i];
                    minCopies=Math.min(minCopies,copies);
                }
            }
            return minCopies;
    }
}
