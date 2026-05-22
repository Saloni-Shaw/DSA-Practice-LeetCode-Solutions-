class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[]map={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        solve(0,digits,new StringBuilder(),result,map);
        return result;
    }
    public void solve(int index, String digits,StringBuilder current,List<String>result,String[]map){
        //BASE CASE
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        //current digit
        char digit=digits.charAt(index);
        String letters=map[digit-'0'];

        for(int i=0;i<letters.length();i++){
            current.append(letters.charAt(i));
            //RECURSE
            solve(index+1,digits,current,result,map);
            current.deleteCharAt(current.length()-1);

        }
    }
}
