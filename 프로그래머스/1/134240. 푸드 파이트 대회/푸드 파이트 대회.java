import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        // 일단 홀수개인 음식은 -1 한다
        for(int i=0;i<food.length;i++){
            if(food[i] % 2 != 0){
                food[i]--;
            }
            // System.out.println(Arrays.toString(food));
        }
        // 그리고 food배열의 각 인자의 절반만큼 해당 인덱스를 문자열에 추가한다
        for(int i=0;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                sb.append(Integer.toString(i));
                // System.out.println(sb);
            }
        }
        answer = sb.toString()+"0"+sb.reverse().toString();
        return answer;
    }
}