import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortedEmergency = emergency.clone();
        // 정렬
        for(int i=0;i<emergency.length;i++){
            for(int j=1;j<emergency.length;j++){
                int tmp = sortedEmergency[j];
                if(sortedEmergency[j]>sortedEmergency[j-1]){
                    sortedEmergency[j] = sortedEmergency[j-1];
                    sortedEmergency[j-1] = tmp;
                }
            }
        }
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