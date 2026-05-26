class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String sub=doubled.substring(1,doubled.length()-1);
        boolean exists=sub.contains(s);
        return exists;
    }
}
