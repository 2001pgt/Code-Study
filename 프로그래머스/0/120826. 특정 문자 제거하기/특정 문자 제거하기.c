#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, const char* letter) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int len = strlen(my_string);
    char target = letter[0]; // letter의 첫 번째 문자로 비교
    char* answer = (char*)malloc(len + 1); // 널 종료문자 포함 공간 할당
    int index = 0; // answer의 현재 위치를 추적
    
    for (int i = 0; i < len; i++) {
        if (my_string[i] != target) {
            answer[index++] = my_string[i]; // 조건에 맞으면 문자 추가
        }
    }
    answer[index] = '\0'; // 문자열 종료
    
    return answer;
}