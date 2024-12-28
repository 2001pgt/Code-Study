class Solution {
    public int solution(int n) {
        // for문 1~1000까지 돌려서 확인한다.
        int answer = 2;
        for(int i=1;i<=1000;i++)
        {
            if(i*i == n)
            {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}