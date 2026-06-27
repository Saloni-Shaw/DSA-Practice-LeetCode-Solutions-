class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] letterCount=new int[26];

        int magLength=magazine.length();
        int ranLength=ransomNote.length();

        for(int i=0;i<magLength;i++){
            letterCount[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<ranLength;i++){
            int index=ransomNote.charAt(i)-'a';

            if(letterCount[index]==0){
                return false;
            }
            letterCount[index]--;
        }
        return true;
        
    }
}
