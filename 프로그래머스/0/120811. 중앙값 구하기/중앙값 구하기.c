#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    // 정렬
    for(int i=0;i<array_len;i++){
        for(int j=1;j<array_len;j++){
            int tmp = 0; // 임시 저장 공간
            // 연속하는 두원소를 비교했을때 뒤의값이 더 크다면
            if(array[j-1]>array[j]){
                tmp = array[j]; // 뒤의 값을 임시 저장 공간에 넣고
                array[j] = array[j-1]; // 그 자리에 앞의 값을 넣어준다
                array[j-1] = tmp; // 앞의 값자리에는 임저 저장 공간에 있던 뒤의 값 자리를 넣어준다.
            }
        }
    }
    answer = array[array_len/2]; 
    return answer;
}