class Solution {
    public int solution(int[] common) {
        // common의 길이가 3이상이면
        // common[2]-common[1] == common[1]-common[0] -> 등차
        // 다르면 등비
        // 등차면 마지막 원소에 공차 더해준다
        // 등비면 마지막 원소에 공비를 곱해준다.
        // 공차는 common[1]-common[0] 로 구하고
        // 공비는 common[1]/common[0]
        int answer;
        if(common[2]-common[1] == common[1]-common[0]){
            answer = common[common.length-1] + (common[1]-common[0]);
        }
        else{
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        return answer;
    }
}