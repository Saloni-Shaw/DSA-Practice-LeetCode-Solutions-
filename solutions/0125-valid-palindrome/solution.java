class Solution {
    public boolean isPalindrome(String s) {
        String l=s.toLowerCase();// converted into lowercase
        int left=0;
        int right=l.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(l.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(l.charAt(right))){
                right--;
            } 
            if(l.charAt(left)!=l.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
