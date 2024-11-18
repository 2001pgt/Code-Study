import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public int[] solution(int n) {
        int x;
        // n 이 홀수일때와 짝수일때 경우 나누기
        if(n%2 == 1){
            x = n/2 + 1;
        }
        else{
            x = n/2;
        }
        // n의 홀짝 여부에 따라 배열 생성
        int[] array = new int[x];
        
        for(int i=0;i<x;i++){
            array[i] = 1+i*2; // 배열에 홀수만 추가
        }
        return array;
    }
}