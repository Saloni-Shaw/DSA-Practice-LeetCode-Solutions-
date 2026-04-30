class Solution {
    public int firstUniqChar(String s) {
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            boolean isUnique=true;
            for(int j=0;j<ch.length;j++){
                if(j==i){
                    continue;
                }
                if(ch[j]==ch[i]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                return i;
            }
        }
        return -1;
    }
}
