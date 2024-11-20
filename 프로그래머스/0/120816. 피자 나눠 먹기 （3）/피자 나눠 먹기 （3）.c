#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
int answer = 0;
        int pizza = 1; // 피자
        while(true){
            // 피자를 slice조각 낸것이 사람 수보다 많으면 종료
            if(n<=pizza*slice){
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