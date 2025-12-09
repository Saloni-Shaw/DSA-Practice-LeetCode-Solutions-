class Solution {
public:
    string removeStars(string s) {
        string result="";//store the pushed characters or final result
        for (int i=0;i<s.size();i++){
            char ch=s[i];
            if(ch=='*'){
                if(!result.empty()){
                    result.pop_back();
                }
            }
            else{
                result.push_back(ch);
            }
        }
        return result; 
    }
};
