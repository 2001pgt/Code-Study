#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
        size_t len = strlen(my_string);             // 입력 문자열 길이 계산
        char *answer = (char *)malloc(len + 1);     // 동적 메모리 할당 (문자열 길이 + 1)
        for(int i=len-1;i>=0;i--){
            // for문을 사용해 입력받은 문자열의 마지막 문자부터 차례대로 빈문자열에 삽입
            answer[i] = my_string[len-i-1];
        }
        answer[len] = '\0'; // 널 문자 추가
        return answer;
}