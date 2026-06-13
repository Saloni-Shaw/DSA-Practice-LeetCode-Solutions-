class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int sum=0;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                sum+=weights[ch-'a'];
            }
            int rem=sum%26;
            ans.append((char)('z'-rem));
        }
        return ans.toString();
    }
}
