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