class Solution {
    public int compress(char[] chars) {
    int left=0;
    int right=0;
    while(right<chars.length){
        char current_char=chars[right];
        int count=0;
        while(right<chars.length && chars[right]==current_char){
            right++;
            count++;
        }
        chars[left++]=current_char;

        if(count>1){
            for(char c: Integer.toString(count).toCharArray()){
                chars[left++]=c;
            }
        }
    }
    return left;    
    }
}
