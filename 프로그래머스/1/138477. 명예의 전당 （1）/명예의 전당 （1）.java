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