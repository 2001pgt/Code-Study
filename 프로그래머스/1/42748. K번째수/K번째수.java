import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> tmpArr = new ArrayList<>();
        // for문의 시작을 i로 하고 끝을 j로 설정한다.
        // 그리고 해당범위의 배열을 순회하며 원소를 새로운 임시정수배열에 추가 후 정렬
        // k번째 인덱스의 값을 answer에 추가한다.
        // 임시 정수 배열 초기화
        for(int i=0;i<commands.length;i++){
            for(int j = commands[i][0]-1;j<commands[i][1];j++){
                tmpArr.add(array[j]);
            }
            // System.out.println(tmpArr);
            Collections.sort(tmpArr);
            answer[i] = tmpArr.get(commands[i][2]-1);
            tmpArr.clear();
        }
        return answer;
    }
}