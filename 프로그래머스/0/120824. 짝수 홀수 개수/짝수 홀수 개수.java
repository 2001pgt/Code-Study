class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i=0;i<num_list.length;i++){
            // 만약 원소가 짝수면
            if(num_list[i] % 2 ==0){
                answer[0] += 1; // 짝수의 개수 +1
            }
            // 홀수면
            else{
                answer[1] += 1; // 홀수의 개수 +1
            }
        }
        
        return answer;
    }
}