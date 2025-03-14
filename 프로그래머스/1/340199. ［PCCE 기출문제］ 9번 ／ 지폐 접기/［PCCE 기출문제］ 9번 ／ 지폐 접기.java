import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        // 지폐를 접은 횟수를 저장할 변수 생성
        // 지폐의 큰 쪽을 지갑의 큰쪽과 비교 작은쪽은 작은쪽끼리 비교
         // 지폐와 지갑 배열을 정렬하여 [0] 이 작은쪽 [1]이 큰쪽으로 한다.
         // wallet[0] 과 bill[0] 을 비교 
         // wallet[1] 과 bill[1] 을 비교한다
        // 지폐쪽이 하나라도 더 크다면
        // 지폐의 더 큰쪽을 반으로 접고 
        // 접은 횟수 +1
        
        // 둘다 작다면 반복 종료 -> 접은 횟수 반환
        
        int answer = 0;
        while(true){
            Arrays.sort(wallet);
            Arrays.sort(bill);
            if(wallet[0] < bill[0]){
                bill[1] = bill[1]/2;
                answer++;
            }
            else if(wallet[1] < bill[1]){
                bill[1] = bill[1]/2;
                answer++;
            }
            else{
                break;
            }
        }
        return answer;
    }
}