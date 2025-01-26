class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // 만약 signs[i]가 true면 answer += absolutes[i]
        // false 면 answer -= absolutes[i]
        for(int i=0;i<signs.length;i++){
            if(signs[i]){
                answer += absolutes[i];
            }
            else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}