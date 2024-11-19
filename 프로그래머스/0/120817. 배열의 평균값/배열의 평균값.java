class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        // 배열의 원소들을 answer에 하나씩 더하기
        for(int i=0;i<numbers.length;i++){
            answer += numbers[i];
        }
        // answer에 들어간 정수는 자동으로 실수로 형변환
        answer = answer / numbers.length;
        return answer;
    }
}
// 다른 풀이
// Arrays.stream을 활용한 풀이
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0); // 평균을 구하는 메서드
    }
}
