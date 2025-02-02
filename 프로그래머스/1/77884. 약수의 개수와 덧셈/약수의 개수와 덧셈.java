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