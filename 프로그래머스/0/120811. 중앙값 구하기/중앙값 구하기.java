import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 정렬 메서드
        int answer = 0;
        answer = array[array.length/2];
        return answer;
    }
}
// 추가 풀이
// 시프트 연산자 사용
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }
}
// 정렬을 직접 구현
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        answer = array[array.length / 2];

        return answer;
    }
}
