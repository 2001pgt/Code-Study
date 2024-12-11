class Solution {
    public String solution(String my_string) {
        
         StringBuilder sb = new StringBuilder();
        // 문자열을 순회
        // 빈 문자열 안에 문자가 없으면 넣고 중복되면 스킵
        for(int i=0;i<my_string.length();i++)
        {   
            // indexOf의 문자열이 sb안에 없으면 -1을 반환함을 이용
            // -1 반환시 문자추가
            if(sb.indexOf(String.valueOf(my_string.charAt(i)))==-1)
            {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}

// 다른 풀이 
// LinkedHashSet을 이용
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
