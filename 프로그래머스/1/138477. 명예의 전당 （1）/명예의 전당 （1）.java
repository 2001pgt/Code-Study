메모리: 79.2 MB, 시간: 7.88 ms
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> numbers = new ArrayList<>();
        // score를 처음부터 순회하며 한개씩 임시 리스트에 넣는다.
        // 한번 리스트에 점수가 들어올때마다 정렬을 한다.
        // 그리고 리스트의 크기가 k보다 커지면 가장 작은 점수를 삭제한다.
        // 그리고 가장 낮은 점수를 answer에 추가한다.
        for(int i=0;i<score.length;i++){
            numbers.add(score[i]);
            Collections.sort(numbers);
            if(numbers.size() > k){
                numbers.remove(0);
            }
            answer[i] = numbers.get(0);
        }
        return answer;
    }
}

// priority queue를 이용한 풀이
// min-heap을 이용한 priority queue를 사용하였다. .
// 첫번째 풀이가 ArrayList를 활용해서 score의 길이가 짧으면 더 빠르긴하나 값을 정렬할때 최선의 경우O(n),
// 최악의 경우 O(n log n) 까지 걸리기 때문에 score의 길이가 늘어날수록 시간이 급격하게 늘어나게 된다.
// 하지만 priority queue는 값을 삭제하거나 삽입하는 시간복잡도가 O(logN)이 나온다.
// 그래서 평균적으로 더 빠른 속도를 보여준다.
메모리: 86.6 MB, 시간: 1.79 ms
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        for(int i=0;i<score.length;i++){
            numbers.add(score[i]);
            if(numbers.size() > k){
                numbers.remove();
            }
            answer[i] = numbers.peek();
        }
        return answer;
    }
}
