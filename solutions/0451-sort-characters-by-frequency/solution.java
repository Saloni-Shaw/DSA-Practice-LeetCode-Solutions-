class Solution {
    public String frequencySort(String s) {
       int[] counts=new int[128];
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        counts[c]++;
       } 
       StringBuilder result=new StringBuilder();
       while(result.length()<s.length()){
        int maxCount=0;
        char bestChar=0;
        for(int i=0;i<128;i++){
            if(counts[i]>maxCount){
                maxCount=counts[i];
                bestChar=(char) i;
            }
        }
        for(int j=0;j<maxCount;j++){
            result.append(bestChar);
        }
        counts[bestChar]=0;
       }
       return result.toString();
    }
}
