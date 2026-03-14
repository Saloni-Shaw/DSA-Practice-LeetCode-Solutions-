class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            String[] words=sentences[i].split(" ");
            count=words.length;
            if(count>maxCount){
                maxCount=count;
            }
        }
        return maxCount;
    }
}
