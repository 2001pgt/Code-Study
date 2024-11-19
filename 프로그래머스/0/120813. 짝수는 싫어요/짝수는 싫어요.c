#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
        int x;
        // n 이 홀수일때와 짝수일때 경우 나누기
        if(n%2 == 1){
            x = n/2 + 1;
        }
        else{
            x = n/2;
        }
        // n의 홀짝 여부에 따라 배열 생성
        int* array = (int *)malloc(x * sizeof(int));
    
        for(int i=0;i<x;i++){
            array[i] = 1+i*2; // 배열에 홀수만 추가
        }
        return array;
}