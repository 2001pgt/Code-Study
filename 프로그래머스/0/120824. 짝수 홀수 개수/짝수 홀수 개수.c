#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int* solution(int num_list[], size_t num_list_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
        int* answer = (int*)calloc(num_list_len, sizeof(int)); // 정수 배열 2칸을 0으로 초기화 하면서 동적할당
        for(int i=0;i<num_list_len;i++){
            // 만약 원소가 짝수면
            if(num_list[i] % 2 ==0){
                answer[0] += 1; // 짝수의 개수 +1
            }
            // 홀수면
            else{
                answer[1] += 1; // 홀수의 개수 +1
            }
        }
        return answer;
}