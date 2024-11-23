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