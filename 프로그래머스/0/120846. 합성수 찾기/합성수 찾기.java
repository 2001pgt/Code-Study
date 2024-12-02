class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1,2,3은 합성수가 아니므로 스킵하고 4부터 합성수 확인 시작
        for(int i=4;i<=n;i++){
            // 2보다 크고 i보다 작은 수로 나눴을때
            for(int j=2;j<i;j++){
                 //나누어 떨어지면 합성수
                if(i % j == 0){
                    answer += 1;
                    break; // 중복 카운트 방지를 위해 합성수가 판명되면 다음 숫자로 넘어감
                }
            }
        }
        return answer;
    }
}