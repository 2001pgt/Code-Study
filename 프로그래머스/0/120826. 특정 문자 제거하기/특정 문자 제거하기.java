class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            // letter 과 i번째 인덱스 문자가 같으면
            if(my_string.charAt(i)==letter.charAt(0)){
                continue; // 다음 문자로 넘어간다
            }
            // 다르면
            else{
                answer += my_string.charAt(i); // answer에 해당 문자 추가
            }
        }
        return answer;
    }
}