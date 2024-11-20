#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
        int answer = 0;
        int pizza = 1; // 피자
        while(true){
            // n명이 6조각짜리 피자를 나왔을 때 나누어 떨어지면
            if((6*pizza) % n == 0){
                answer = pizza; 
                break; // 종료
            }
            // 그렇지 않으면 피자 추가 후 반복
            else{
                pizza+=1;
            }
        }
        return answer;
}
// 다른 풀이
// 최소공배수(LCM) 활
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    // 먼저 n을 나눌 수 있는 최대의 소인수로 나누어 축소합니다.
    if(n % 2 == 0) n /= 2; // n % 2 == 0이면 n /= 2로 나누고,
    if(n % 3 == 0) n /= 3; // n % 3 == 0이면 n /= 3으로 나눕니다.

    return n;
}
