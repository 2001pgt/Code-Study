/// 풀이 방법 마다 메모리와 속도를 비교해 보았는데 재밌는 결과가 나왔다.
// 가장 느린 건 else if문을 사용한 풀이였다.
//  뭔가 가장 많이 떠올리는 풀이 같은데 가장 느리고 메모리도 많이 사용했다.
1번 메모리: 76.3 MB, 시간: 0.04 ms
class Solution {
    public int solution(int price) {
        int answer = 0;

        if(price>=500000){
            answer = (int) (price * 0.8);
        }else if(price>=300000){
            answer = (int) (price * 0.9);
        }else if(price>=100000){
            answer = (int) (price * 0.95);
        }else answer = price;

        return answer;
    }
}
// 2번째로 느린 풀이는 프로그래머스에서 가장 많은 좋아요를 받은 풀이다. 코드가 간결하고 읽기도 편하다.
// 하지만 속도는 그닥 빠른편이 아니었다.
2번 메모리: 75.9 MB, 시간: 0.05 ms
class Solution {
    public int solution(int price) {
        int answer = 0;

        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}
// 3번째 풀이는 나의 풀이다.
// 처음 문제를 보고 뭔가 이렇게 풀어보고 싶다는 생각이 들었다.
// 결과는 생각보다 괜찮았다.
// 위의 2개의 풀이보다 속도도 빠르고 메모리도 적게 사용됐다.
3번 메모리: 75.7 MB, 시간: 0.03 ms
class Solution {
    public int solution(int price) {
        while(true){
            // 50만원 이상일 때
            if(price>=500000){
                price = price*80/100;
                break;
            }
            // 30만원 이상일 때
            if(price>=300000){
                price = price*90/100;
                break;
            }
            // 10만원 이상일 때
            if(price>=100000){
                price = price*95/100;
                break;
            }
            // 반복하지 않고 종료
            break;
        }

        return price;
    }
}
// 가장 빠르고 메모리도 적게 사용한 것은 삼항연산자였다. 
// 위의 풀이들과 메모리에서 차이가 많이 났다.
// 하지만 코드의 가독성이 별로인것 같다.
4번 메모리: 74.3 MB, 시간: 0.03 ms
class Solution {
    public int solution(int price) {
        int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));
        answer = (int)(price*ratio);
        return answer;
    }
}
// 이렇게 풀이 별로 속도와 메모리가 차이나는 이유가 뭘까?
// 1번 풀이는 아마 처음부터 끝까지 컴파일러가 코드를 읽어야 되서 가장느리고 메모리도 많이 먹는거 같다.
// 2번은 아마도 0.8같은 부동소수점을 사용해고 또 형변환도 하기 때문에 3번과 유사한 형태지만 더 느린게 아닐까 생각된다.
// 3번은 부동소수점도 사용되지 않았고 형변환도 없고 조건을 만족할시 즉각 종료되기 때문에 빠른거이 아닐까 생각된다.
// 4번 삼항 연산자 풀이는 삼항연산자라는 것 자체가 엄청빠른거같다.
