import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 사과 배열을 정렬한다.
        // 점수가 높은 사과부터 m개씩 담아서 점수를 계산한다.
            // 정렬된 리스트의 m번째 원소의 점수 * m을 한 값을 answer에 추가한다
        // 남은 사과의 개수가 m보다 적다면 종료
        Arrays.sort(score);
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }
        for(int i=0;i<score.length/m;i++){
            answer += (score[i*m+m-1]*m);
        }
        // System.out.println(Arrays.toString(score));
        // System.out.println(list);
        return answer;
    }
}