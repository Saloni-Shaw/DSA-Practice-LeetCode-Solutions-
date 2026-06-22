class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts=new int[5];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b'){
                counts[0]++;
            }
            else if(ch=='a'){
                counts[1]++;
            }
            else if(ch=='l'){
                counts[2]++;
            }
            else if(ch=='o'){
                counts[3]++;
            }
            else if(ch=='n'){
                counts[4]++;
            }
        }
        counts[2]=counts[2]/2;
        counts[3]=counts[3]/2;
        int minAnswers=counts[0];
        for(int i=0;i<5;i++){
            minAnswers=Math.min(minAnswers,counts[i]);
        }
        return minAnswers;
    }
}
