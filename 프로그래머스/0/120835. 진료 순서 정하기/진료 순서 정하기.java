import java.util.*;
// 82mb , 0.03ms
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortedEmergency = emergency.clone();
        // 내림차순 정렬
        for(int i=0;i<emergency.length;i++){
            for(int j=1;j<emergency.length;j++){
                int tmp = sortedEmergency[j];
                if(sortedEmergency[j]>sortedEmergency[j-1]){
                    sortedEmergency[j] = sortedEmergency[j-1];
                    sortedEmergency[j-1] = tmp;
                }
            }
        }
        // emergency의 현재값과 같은 값을 sortedEmergency에서 찾아 인덱스+1한 값을 answer에 넣어준다.
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<emergency.length;j++){
                if(emergency[i] == sortedEmergency[j]){
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}
// 77.6mb, 0.03ms
// 다른 풀이
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            // 현재 i번째 값보다 배열 내에서 큰값을 센다.
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            // 세서 더해주면 그것이 우선순위가 된다.
            answer[i] = idx;
        }
        return answer;
    }
}
