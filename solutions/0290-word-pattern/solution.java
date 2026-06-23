class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        int[] letterPositions=new int[26];
        Set<String> usedWords=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            int letterIndex=pattern.charAt(i)-'a';
            String word=words[i];

            if(letterPositions[letterIndex]>0){
                int pastIndex=letterPositions[letterIndex]-1;
                String pastWord=words[pastIndex];

                if(!pastWord.equals(word)){
                    return false;
                }
            }
            else{
                if(usedWords.contains(word)){
                    return false;
                }
                usedWords.add(word);
            }
            letterPositions[letterIndex]=i+1;
        }
        return true;
    }
}
