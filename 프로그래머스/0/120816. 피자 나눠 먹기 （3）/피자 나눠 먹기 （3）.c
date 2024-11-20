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

// 다른 풀이
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int s, int n) {    
    // answer=n/s+(추가 피자 필요 여부)
        /
    return n/s+!!(n%s); //작동 원리

// 첫 번째 !는 NOT 연산자로, 값을 논리적으로 반전시킵니다.
// 참(true)이면 거짓(false)으로, 거짓이면 참으로 바꿉니다.

// 두 번째 !는 다시 값을 반전시켜 원래의 논리 상태로 되돌립니다.
// 이 과정에서 값은 0 또는 1로 논리형 결과를 반환합니다.
        
// 결과
// 숫자 0: 거짓(false)으로 처리.
// 숫자 0이 아닌 모든 값: 참(true)으로 처리.
// 최종적으로 0이면 0, 0이 아니면 1로 변환됩니다.
}
