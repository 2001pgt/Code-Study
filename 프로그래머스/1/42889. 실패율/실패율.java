import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer,Double> map = new HashMap<>();
        // 1~N 번째 스테이지의 실패율을 구하는문제
        // i번째 스테이지의 실패율은 stages배열에서 i>인 원소의 개수/i >= 인 원소의 개수 이다.
        // i 번째 스테이지의 i를 key,실패율을 value값으로 하는 해쉬맵을 생성한다.
        // 해당 해쉬맵의 value(실패율)의 크기가 큰 key(스테이지)부터 꺼내어 answer 배열에 추가한다.
        for(int i=1;i<N+1;i++){
            int notClear = 0;
            int all = 0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]>i){
                    all++;
                }
                else if(stages[j] == i){
                    notClear++;
                    all++;
                }
            }
            double fail = (double)notClear/(double)all;
            map.put(i,fail);
            // System.out.println("도전자 :"+notClear);
            // System.out.println("클리어한 사람 :"+all);
            // System.out.println("해쉬맵: "+map);
        }
        for(int i=0;i<N;i++){
            int max = -1;
            boolean first = true;
            for(int j : map.keySet()){
                if(first){
                    max = j;
                    first = false;
                }
                else if(map.get(max)<map.get(j)){
                    max = j;
                }
            }
            map.remove(max);
            answer[i] = max;
        }
        
        return answer;
    }
}