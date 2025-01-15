메모리: 85.7 MB, 시간: 0.04 ms
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
// 다른 풀이
// 수학적 풀이 일의 자리 숫자를 더한 후 해당 자리를 나누기10 함으로 삭제 시킨다.
메모리: 85.7 MB, 시간: 0.03 ms
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
