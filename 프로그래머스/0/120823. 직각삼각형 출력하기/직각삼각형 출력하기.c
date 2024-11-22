#include <stdio.h>

int main(void) {
    int n;
    scanf("%d", &n);
    for(int i=1;i<=n;i++){
            int count = 0; // *의 출력횟수를 세는 변수
            // *출력횟수가 i번 만큼 출력되게하는 조건
            while(count<i){ 
                printf("*");; // 출력
                count++; // * 출력횟수 증가
            }
            printf("\n"); // 줄바꿈
        }
    return 0;
}