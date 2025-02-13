import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] words = s.split(" ", -1);  // 공백을 유지하기 위해 "-1" 옵션 추가
        StringBuilder answer = new StringBuilder();

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(word.charAt(i))); // 짝수 인덱스 → 대문자
                } else {
                    answer.append(word.charAt(i)); // 홀수 인덱스 → 소문자
                }
            }
            if (j != words.length - 1) {
                answer.append(" "); // 단어 사이의 공백 유지
            }
        }
        return answer.toString();
    }
}
