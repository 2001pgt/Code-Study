import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int[] array) {
        // 정수형 ArrayList 생성
        List<Integer> list = new ArrayList<>();
        // 새로운 ArrayList에 array의 원소 넣기
        for (int num : array) {
            list.add(num); // 박싱
        }
        // 정렬
        Collections.sort(list);
        // 리스트 크기
        int size = list.size();
        int answer = 0;
        // 중앙값은 크기/2 값의 몫으로 인덱싱
        answer = list.get(size/2); 
        return answer;
    }
}