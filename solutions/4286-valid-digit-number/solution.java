class Solution {
    public boolean validDigit(int n, int x) {
        int firstDigit=n;
        while(firstDigit>=10){
            firstDigit/=10;
        }
        boolean found=false;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            if(digit==x){
                found=true;
            }
            temp/=10;
        }
        return found && firstDigit!=x;
    }
}
