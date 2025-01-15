import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // 문자열로 만들어서 문자하나씩 다시 정수로 만들어서 더해준다.
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++){
            answer += str.charAt(i) - 48; // 문자 1 은 십진수 49 이다
            // 그러므로 - 48 을 빼면 문자값과 같은 정수를 더할수있다.
        }
        return answer;
    }
}