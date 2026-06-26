class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<k;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i'){
                vowelCount++;
            }
        }
        int maxVowelCount=vowelCount;
        for(int i=k;i<ch.length;i++){
            if(ch[i-k]=='a'||ch[i-k]=='e'||ch[i-k]=='o'||ch[i-k]=='u'||ch[i-k]=='i'){
                vowelCount--;
            }
             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i'){
                vowelCount++;
            }
            maxVowelCount=Math.max(maxVowelCount,vowelCount);
        }
        return maxVowelCount;
    }
}
