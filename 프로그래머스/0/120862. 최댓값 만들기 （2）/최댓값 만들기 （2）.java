메모리:66.1 MB, 시간: 0.42 ms
class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0]*numbers[1];
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(i == j)continue;
                else
                {
                    if(numbers[i]*numbers[j] > max){
                        max = numbers[i]*numbers[j];
                    }
                }
            }
        }
        return max;
    }
}
// 다른 풀이 Math의 메서드를 이용해 풀었다.
음수끼리의 곱을 고려하여
max메서드로 정렬된 정수배열의 맨앞과 맨뒤의 수들을 각각 곱해 더 큰수를 리턴한다.
// 정렬에 시간을 많이 써서 그런지 속도는 느린거 같다
메모리: 78.5 MB, 시간: 1.34 ms
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}
