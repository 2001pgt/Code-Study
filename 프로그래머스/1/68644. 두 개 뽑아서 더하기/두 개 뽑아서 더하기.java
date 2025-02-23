import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        // 이중 for문으로 가능한 모든 경우의수 찾기
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!answer.contains(numbers[i]+numbers[j])){
                    answer.add(numbers[i]+numbers[j]);
                }
            }
        }
        System.out.println(answer);
        // 정렬 
        Collections.sort(answer);
        int[] intArray = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            intArray[i] = answer.get(i);
        }

        return intArray;
    }
}