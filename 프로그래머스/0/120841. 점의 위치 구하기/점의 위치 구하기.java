class Solution {
    public int solution(int[] dot) {
        // x 좌표가 0보다 클 때
        if(dot[0]>0){
            // y좌표가 0보다 크면
            if(dot[1]>0){
                return 1; // 1사분면
            }
            // y좌표가 0보다 작으면
            else{
                return 4; // 4사분면
            }
        }
        // x 좌표가 0보다 작을 때
        else{
            // y좌표가 0보다 크면
            if(dot[1]>0){
                return 2; // 2사분면
            }
            // y좌표가 0보다 작으면
            else{
                return 3; // 3사분면
            }
        }
    }
}