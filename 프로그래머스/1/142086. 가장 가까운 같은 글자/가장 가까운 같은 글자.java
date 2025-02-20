메모리: 77.3 MB, 시간: 152.11 ms
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int idx = -1;
            for(int j=0;j<i;j++){
                // 만약 같은 문자를 발견시 해당 문자의 인덱스를 idx에 저장
                if(s.charAt(i) == s.charAt(j)){
                    idx = i - j;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
// 다른 풀이
// hashmap 클래스를 사용
// 키 = 문자 ,값 = 해당 문자의 인덱스값
// 문자열을 순회하며 해당 문자가 처음 등장시 -1 저장 후 map에 해당 문자의 값을 현재 문자의 인덱스 값으로 업데이트
// 다음에 다시 같은 값이 등장시 i에서 해당 해시맵 키에 대응되는 값을 빼서 거리 계산
메모리: 95.8 MB, 시간: 7.45 ms
import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>(); 
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}
// substring 으로 현재문자 이전까지 추출하여 subStr에 저장
// indexOf()함수로 subStr 에 현재 문자가 없으면 -1이 저장되게함
// 만약 있다면 해당인덱스를 반환 하므로 다음 조건문으로 넘어감
//  lastIndexOf()함수를 이용하여 해당문자가 subStr에서 마지막으로 등장하는 인덱스를 반환하게하여 i에서 빼 거리를구한다.
메모리: 101 MB, 시간: 49.63 ms
class Solution {
    public int[] solution(String str) {
        int[] result = new int[str.length()];
        for(int i=0;i<str.length();i++){
            String subStr = str.substring(0,i);
            if(subStr.indexOf(str.charAt(i))==-1) {
                result[i] = -1;
            }else {
                result[i] = i-subStr.lastIndexOf(str.charAt(i));
            }
        }
        return result;
    }
}
