#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    int answer = 0;
        // 평각
        if(angle == 180){
            answer = 4;
        }
        // 둔각
        else if(angle > 90){
            answer = 3;
        }
        // 직각
        else if(angle == 90){
            answer = 2;
        }
        // 예각
        else{
            answer = 1;
        }
        return answer;
}