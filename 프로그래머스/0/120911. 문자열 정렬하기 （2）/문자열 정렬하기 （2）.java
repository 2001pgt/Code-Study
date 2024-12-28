import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        // 모두 소문자로 변경하는 메서드 사용 
        // 문자열을 문자 배열로 변경후 정렬
        // 다시 문자열로 변경
        String lowerCase = my_string.toLowerCase();
        char[] chararray = lowerCase.toCharArray();
        Arrays.sort(chararray);
        String answer = new String(chararray);
        return answer;
    }
}