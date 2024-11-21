#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int money) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(2 * sizeof(int));
    answer[0] = money/5500;
    answer[1] = money%5500;
    return answer;
}

// 다른 풀이
// 배열의 주소가 배열의 첫번째 인덱스 인것을 활용하여 문제를 풀었다.
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int money) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(2*sizeof(int));


    *answer = money / 5500;
    *(answer + 1) = money%5500;


    return answer;
}
// 그리고 java의 처음 풀 때 자바의 풀이처럼 2칸 짜리 배열을 생성하여 풀었는데 틀렸다고 떳다.
// 이유를 찾아보니 자바에서는 배열이 힙 영역에 저장되서 참조를 해도 메모리에서 사라 지지않는다.
// 또한 자바의 가비지 컬렉터(GC)가 메모리를 자동으로 관리해 주기 때문에 메모리 해제 걱정 없이 배열을 반환할 수 있다.
// 하지만 C에서는 배열이 스택에 저장되며 함수가 종료되면 스택이 해제되면서 배열이 메모리에서 사라지게 된다.
// 그래서 자바와 같은 방법으로 풀려면 malloc을 이용하여 배열을 힙에 저장하는 방법으로 풀 수 있다.
