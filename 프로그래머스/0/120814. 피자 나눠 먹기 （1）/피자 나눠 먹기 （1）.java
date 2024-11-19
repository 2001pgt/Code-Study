class Solution {
    public int solution(int n) {
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
}
// 다른 풀이
class Solution {
    public int solution(int n) {
        return (n + 6) / 7; // ???? 천잰가
    }
}

// 삼항 연산자 이용한 풀이
class Solution {
    public int solution(int n) {
        int answer = (n%7==0) ? n/7 : n/7 + 1;

        return answer;
    }
}
