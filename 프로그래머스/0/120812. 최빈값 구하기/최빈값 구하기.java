import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 정렬
        Arrays.sort(array);
        
        int max_count = 0; // 출현 횟수
        int now_count = 1; // 현재 값의 출현 횟수
        int num = -1; // 최빈값
        boolean same = false; // 최빈값이 중복되는가?
        // 원소가 1개일 때
        if(array.length == 1){
            answer = array[0];
        }
        // 한 개 이상일 때
        else{
            for(int i=1;i<array.length;i++){
                // 현재 원소가 이전 원소와 같으면
                if(array[i]==array[i-1]){
                    now_count += 1; // 현재의 원의 빈도+1
                    // 최대 빈도와 현재원소 빈도가 같으면
                    if (max_count == now_count){
                        same = true; // 최빈값 중복 true
                    }
                    // 현재원소빈도가 최대 빈도보다 크면
                    else if(max_count < now_count){
                        max_count = now_count; // 최대 빈도를 현재원소의 빈도수로 바꾸고
                        num = array[i];// 최빈값을 현재 원소로 바꾼다.
                        same = false; // 최빈값은 중복되지 않으면 false로 바꾼다.
                    }
                }
                // 현재원소가 이전 원소와 달라지면
                else{
                    now_count = 1; // 현재 빈도를 초기화
                }
            }
            answer = num; // 최빈값을 정답에 추가
        }
        // 만약 최빈값이 중복되면
        if(same){
            answer = -1; // -1
        }
        
        return answer;
    }
}