    class Solution {
        public String finalString(String s) {
        String text="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                char[]arr=text.toCharArray();
                int left=0;
                int right=arr.length-1;
                while(left<right){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
                text=new String(arr);
            }
            else{
                text+=s.charAt(i);
                }
        }
        return text; 
        }
    }
