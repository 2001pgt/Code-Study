import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                numbers.add(arr[i]);
            }
        }
        if(numbers.isEmpty()){
            numbers.add(-1);
        }
        Collections.sort(numbers);
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}