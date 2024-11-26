class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 문자열을 배열로 변경 후 for - each
        for(char c : rsp.toCharArray()){
            switch(c){
                case '2': answer += "0";
                          break;
                case '0': answer += "5";
                          break;
                case '5': answer += "2";
                         
            }
        }
        return answer;
    }
}