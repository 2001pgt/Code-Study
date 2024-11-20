#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0; 
        int pizza = 1; // 피자 수
        while(true){
            // 피자를 7조각 낸것이 사람 수보다 많으면 종료
            if(n<=pizza*7){
                answer = pizza;
                break;
            }
            // 사람수 보다 적으면 한판 더 추가 후 반복
            else{
                pizza += 1;
            }
        }
        return answer;
}

// 다른 풀이
// 삼항연산자 활용
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    answer = n / 7 + ((n % 7 == 0) ? 0 : 1);
    return answer;
}
