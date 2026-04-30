class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ch=s.toCharArray();
        char[] arr=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(arr);
        if (Arrays.equals(ch,arr)){
            return true;
        }
        else{
            return false;
        }
    }
}
