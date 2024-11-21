#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int* solution(int num_list[], size_t num_list_len) {
    int tmp = 0; // 임시 저장 공간
        // 자리 바꾸기 시작
        for(int j=0;j<(num_list_len/2);j++){
            tmp = num_list[(num_list_len-1)-j]; // 임시 저장공간에 j번째 원소의 대응되는 반대쪽 원소를 넣고
            num_list[(num_list_len-1)-j] = num_list[j]; // 대응되는 반대쪽 원소자리에 j번째 원소를 넣는다.
            num_list[j] = tmp; // 그리고 j번째 자리에는 임시 저장 공간에 넣어놨던 반대편 원소를 넣는다.
        }
        return num_list;
}