/// 풀이 방법 마다 메모리와 속도를 비교해 보았는데 재밌는 결과가 나왔다.
// 가장 느린 건 else if문을 사용한 풀이였다.
// 이게 4가지 풀이중 제일 느려서 놀랬다. 뭔가 가장 많이 떠올리는 풀이 같은데 가장 느리고 메모리도 많이 사용했다.
메모리: 76.3 MB, 시간: 0.04 ms
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
메모리: 75.9 MB, 시간: 0.05 ms
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
// 약간 다르긴 하지만 위의 풀이에 while문을 감싼 형태로 보이는데 속도와 메모리는 더적게 나온다. 뭔가 이상하다.
메모리: 75.7 MB, 시간: 0.03 ms
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
// 가장 빠르고 메모리도 적게 먹는것은 삼항연산자였다. 
// 위의 풀이들과 메모리에서 차이가 많이 났다.
// 하지만 코드의 가독성이 별로인것 같다.
메모리: 74.3 MB, 시간: 0.03 ms
class Solution {
    public int solution(int price) {
        int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));
        answer = (int)(price*ratio);
        return answer;
    }
}
// 왜 이렇게 풀이별로 속도 차이가 나는 걸까 if문이나 else if은 동작형태도 비슷해서 거의 같을줄 알았는데
