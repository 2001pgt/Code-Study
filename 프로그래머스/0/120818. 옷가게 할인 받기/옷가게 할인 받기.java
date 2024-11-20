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
메모리: 74.3 MB, 시간: 0.03 ms
class Solution {
    public int solution(int price) {
        int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));
        answer = (int)(price*ratio);
        return answer;
    }
}
