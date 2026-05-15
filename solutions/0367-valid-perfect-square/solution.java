class Solution {
    public boolean isPerfectSquare(int num) {
        double sqrt=Math.sqrt(num);
        if(sqrt%1==0){
            return true;
        }
        else{
            return false;
        }
    }
}
