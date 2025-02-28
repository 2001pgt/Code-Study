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