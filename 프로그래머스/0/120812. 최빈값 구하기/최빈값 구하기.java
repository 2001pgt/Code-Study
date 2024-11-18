import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 정렬
        Arrays.sort(array);
        int max = 0; //최빈값
        int now = 1;
        int num = -1;
        boolean same = false;
        if(array.length == 1){
            answer = array[0];
        }
        else{
            for(int i=1;i<array.length;i++){
                if(array[i]==array[i-1]){
                    now += 1; 
                    if (max == now){
                        same = true;
                    }
                    else if(max < now){
                        max = now; 
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