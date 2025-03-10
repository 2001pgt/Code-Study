import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 벽 배열을 n칸 만큼 생성하고 section의 맞는 구역의 원소를 0->1로 바꿔준다.
        int[] wall = new int[n];
        for(int i : section){
            wall[i-1] = 1;
        }
        // 배열을 순회하다 값이 1인 부분을 발견하면 페인트를 칠한다.
        // m칸을 칠하기 때문에 i+m을 이동한 후 다시 1인 부분을 찾는다.
        for(int i=0;i<n;i++){
            if(wall[i] == 1){
                answer++;
                i += m-1;
            }
            // System.out.println(i);    
        }
        
        
        // System.out.println(Arrays.toString(wall));
        return answer;
    }
}