import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            // 1) n번째 문자 비교
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            if (c1 != c2) {
                // n번째 문자가 다르면, 그 문자 순으로 정렬
                return Character.compare(c1, c2);
            } else {
                // n번째 문자가 같으면, 문자열 전체 사전순 정렬
                return s1.compareTo(s2);
            }
        });
        return strings;
    }
}
