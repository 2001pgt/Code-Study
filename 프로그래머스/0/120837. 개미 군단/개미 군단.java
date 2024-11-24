class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp>0){
            if(hp>=5){
                hp -= 5;
                answer+=1;
            }
            else if(hp < 5 && hp>=3){
                hp -= 3;
                answer+=1;
                
            }
            else if(hp < 3){
                hp -= 1;
                answer+=1;
            }
            
        }
        return answer;
    }
}

// 다른 풀이
class Solution {
    public int solution(int hp) {
        // 나머지를 몫을 정답에 추가해고 나머지를 계속해서 나누는 방법
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp / 1;

        return answer;
    }
}
