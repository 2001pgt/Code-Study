메모리: 92.1 MB, 시간: 0.04 ms
class Solution {
    public int solution(int[][] dots) {
        // 첫 번째 x좌표와 다른 x좌표를 찾으면
        // 뺀뒤에 절댓갓
        // y도 똑같이
        // 그러고 곱하기
        int x=0;
        int y=0;
        for(int i=0;i<dots.length;i++)
        {
            if(dots[0][0] != dots[i][0])
            {
                x = Math.abs(dots[i][0]-dots[0][0]);
                break;
            }
        }
        for(int i=0;i<dots.length;i++)
        {
            if(dots[0][1] != dots[i][1])
            {
                y = Math.abs(dots[i][1]-dots[0][1]);
                break;
            }
        }
        int answer = x*y;
        return answer;
    }
}
// 다른 풀이
// 처음 내가 생각했던 방법이다
메모리: 84.6 MB, 시간: 0.05 ms
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i = 1; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        answer = tmp2 * tmp3;
        return answer;
    }
}
