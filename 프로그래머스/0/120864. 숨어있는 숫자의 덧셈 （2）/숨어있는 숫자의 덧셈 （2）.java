class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int ad = -1;
        for(char c : my_string.toCharArray()){
            int cInt =  c;
            if(cInt >= 47 && cInt <= 57){
                if(ad == -1) ad = cInt -48;
                else ad = ad * 10 + (cInt-48);
            }
            else{
                if(ad != -1){
                    answer += ad;
                    ad = -1;
                }
            }
        }
        if(ad != -1) answer += ad;
        return answer;
    }
}