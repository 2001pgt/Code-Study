import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 정렬
        Arrays.sort(array);
        
        int count = 0; // 출현 횟수
        int now = 1; // 현재 값의 출현 횟수
        int num = -1; // 최빈값
        boolean same = false; // 최빈값이 중복되는가?
        if(array.length == 1){
            answer = array[0];
        }
        else{
            for(int i=1;i<array.length;i++){
                if(array[i]==array[i-1]){
                    now += 1; 
                    if (count == now){
                        same = true;
                    }
                    else if(count < now){
                        count = now; 
                        num = array[i];
                        same = false;
                    }
                }
                else{
                    now = 1;
                }
            }
            answer = num;
        }
        if(same){
            answer = -1;
        }
        
        return answer;
    }
}