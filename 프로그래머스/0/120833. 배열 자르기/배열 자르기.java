import java.util.ArrayList;
class Solution {
    // 리턴 타입 ArrayList로 변경 , 기존int[]
    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 배열을 자르는 신호를 받는 스위치
        boolean CuttingSwitch = false; // 기본값은 꺼짐
        for(int i=0;i<numbers.length;i++){
            // num1번째 인덱스가 되면 스위치 on
            if(i == num1){
                CuttingSwitch = true;
            }
            // 스위치가 켜져있으면 숫자 추가
            if(CuttingSwitch){
                answer.add(numbers[i]);
            }
            // num2번째 인덱스까지 숫자를 추가한뒤 스위치 off
            if(i == num2){
                CuttingSwitch = false;
            }
        }
        return answer;
    }
}
// 다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // Arrays 패키지의 copyOfRange라는 구간을 자르는 메서드를 이용
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    } 
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        // num2까지 출력되게 범위 제한
        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i]; // num1 만큼 인덱스 i 에서 빼준다
        }
        return answer;
    }
}
