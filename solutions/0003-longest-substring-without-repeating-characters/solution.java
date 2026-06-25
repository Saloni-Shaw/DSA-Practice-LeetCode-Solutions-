class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=s.toCharArray();
        int maxLength=0;
        int left=0;
        HashSet<Character>seen=new HashSet<>();
        for(int right=0;right<ch.length;right++){
            while(seen.contains(ch[right])){
                seen.remove(ch[left]);
                left++;
            }
            seen.add(ch[right]);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
