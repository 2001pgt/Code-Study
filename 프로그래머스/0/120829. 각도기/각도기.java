class Solution {
    public int solution(int angle) {
        int answer = 0;
        // 평각
        if(angle == 180){
            answer = 4;
        }
        // 둔각
        else if(angle > 90){
            answer = 3;
        }
        // 직각
        else if(angle == 90){
            answer = 2;
        }
        // 예각
        else{
            answer = 1;
        }
        return answer;
    }
}

// 다른 풀이
// 삼항 연산자 사용
// 간격하고 빠르지만 가독성이 별로다
class Solution {
    public int solution(int angle) {
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}

// 바로 return하는 방법
// 더 빠른 속도를 기대함
class Solution {
    public int solution(int angle) {
        if (angle > 0 && angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle > 90 && angle < 180) return 3;
        else return 4;
    }
}
