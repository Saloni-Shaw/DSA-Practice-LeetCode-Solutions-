class Solution {
    public String largestGoodInteger(String num) {
       char[] arr=num.toCharArray();
       int count=1;
       char trackingChar=arr[0];
       char max=' ';
       for(int i=1;i<arr.length;i++){
        if(arr[i]==trackingChar){
            count+=1;
        }
        else{
            trackingChar=arr[i];
            count=1;
        }
        if(count==3){
            if(trackingChar>max){
                max=trackingChar;
            }
        }
       }
       if(max==' '){
        return "";
       }
       return ""+max+max+max;
    }
}                                                                               
