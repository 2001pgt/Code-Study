class Solution {
    public String solution(String my_string) {
        String answer = ""; // 빈 문자열
        for(int i=0;i<my_string.length();i++){
            // for문을 사용해 입력받은 문자열의 마지막 문자부터 차례대로 빈문자열에 삽입
            answer += my_string.charAt((my_string.length()-1)-i); 
        }
        return answer;
    }
}