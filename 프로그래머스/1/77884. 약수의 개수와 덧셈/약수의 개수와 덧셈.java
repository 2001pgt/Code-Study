메모리: 94.8 MB, 시간: 8.44 ms
class Solution {
    public int count_divisor(int x){
        int cnt = 0;
        for(int i=1;i<=x;i++){
            if(x % i ==0 ){
                cnt++;
            }
        }
        return cnt;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            if(count_divisor(i) % 2 == 0){
                answer+=i;
            }
            else{
                answer-=i;
            }
        }
        return answer;
    }
}


// 다른 풀이
// 약수의 개수는 제곱수일때 홀수인 점을 이용한 풀이
메모리: 82.6 MB, 시간: 0.06 ms
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
