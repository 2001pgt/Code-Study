메모리: 80.3 MB, 시간: 3.61 ms

class Solution {
    public int solution(String before, String after) {
        // before 첫 문자부터 마지막 문자까지 after안에 있는지 확인한다.
        // 만약 있다면 해당 위치의 after문자를 삭제
        // 없다면 0 반환
        // 전부 통과 하면 1 반환
        StringBuilder sb = new StringBuilder(after);
        for(int i=0;i<before.length();i++){
            
            if(sb.indexOf(String.valueOf(before.charAt(i))) == -1){
                return 0;
            }
            else{
                sb.deleteCharAt(sb.indexOf(String.valueOf(before.charAt(i))));  
            }
            
        }
        return 1;
    }
}
// 다른풀이
// 문자 배열로 만들어 두 문자 배열을 사전순으로 정렬하여 같지 않으면 0 같으면 1을 리턴하게 하였다.
// 시간도 내 풀이의  1/3밖에 안걸린다.
메모리: 89.6 MB, 시간: 1.08 ms
import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}

// replaceFirst()라는 매서드를 활용
// before의 i번째 문자가 after에서 처음 등장하면 그 문자를 ""로 대체
// 이걸 반복 후 after의 길이가 0이 아니면 0 반환 ,0이면 1반환
메모리: 90 MB, 시간: 12.49 ms
class Solution {
    public int solution(String before, String after) {
        for(int i = 0; i < before.length(); i++){
            after = after.replaceFirst(before.substring(i,i+1),"");
        }
        return after.length() == 0? 1: 0;
    }
}
