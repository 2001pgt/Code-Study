메모리: 76.7 MB, 시간: 0.04 ms
class Solution {
    public int solution(int n) {
        // for문 1~1000까지 돌려서 확인한다.
        int answer = 2;
        for(int i=1;i<=1000;i++)
        {
            if(i*i == n)
                answer = 1;
        }
        return answer;
    }
}
// 다른 풀이
메모리: 90.2 MB, 시간: 0.05 ms
class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
// 첫번째 풀이 성능 개선
class Solution {
    public int solution(int n) {
        // for문 1~1000까지 돌려서 확인한다.//
        int answer = 2;
        for(int i=1;i<=1000;i++)
        {
            if(i*i == n)
            {
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}
