import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> ny = new HashMap<>();
        // 이름에 맞게 그리움 점수를 해쉬맵으로 매핑
        for(int i=0;i<name.length;i++) {
            ny.put(name[i],yearning[i]);
        }
        System.out.println(ny);
        // 그리고 사진집에서 꺼낸 사진배열에서 
        // 그리운 사람이 나올때 마다 그사람의 그리움 점수를 점수계산기에 더해준다.
        for(int i=0;i<photo.length;i++){
            int count = 0;
            for(int j=0;j<photo[i].length;j++){
                if(ny.containsKey(photo[i][j])){
                    count+=ny.get(photo[i][j]);
                }
            }
            answer[i] = count;
        }
        // 계산이 끝난 점수는 결과 배열에 넣는다.
        // 위과정을 반복
        return answer;
    }
}