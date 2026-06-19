class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;// if it is 9 ans 
        }
        int []newDigits=new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}
