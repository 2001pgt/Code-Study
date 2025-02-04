메모리: 89.7 MB, 시간: 22.12 ms
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int price1 = price; 
        
        for(int i=0;i<count;i++){
            answer += price1;
            price1 = price1+price;
            System.out.println(answer);
        }
        if(answer > money)
            return answer-money;
        else
            return 0;
    }
}
// 다른풀이
// 등차수열의 합공식을 이용해 값을 구한뒤 0과 합중 더 큰 값을 반환하게 하는 매서드 Math.max를 사용
메모리: 73 MB, 시간: 0.15 ms
class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
