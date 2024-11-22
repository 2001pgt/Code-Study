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
// 다른 풀이
// replace 메서드 사용
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, ""); // letter의 문자가 나오면 ""으로 대체

        return answer;
    }
}
// for-each 문 사용
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (char c : my_string.toCharArray()) {
            // 문자형 c 에 문자 하나 씩 저장 후 비교 같지 않으면 answer에 c추가
            if (c != letter.charAt(0)) answer += c;
        }
        return answer;
    }
}
