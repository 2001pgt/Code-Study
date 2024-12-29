import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        // 배열을 정렬
        // for문 돌려서 해당 원소가 키보다 크면 answer++
        Arrays.sort(array);
        int answer = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>height)
            {
                answer++;
            }
        }
        return answer;
    }
}