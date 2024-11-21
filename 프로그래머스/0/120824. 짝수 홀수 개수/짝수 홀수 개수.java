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
// 다른 풀이

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            // 이렇게 하면 홀수 일떄 answer[1] 이 나와서 홀수 자리가 +1이 되고 짝수일때도 answer[0]이 나와서 짝수 자리가 +1이 된다.
            answer[num_list[i] % 2]++;

        return answer;
    }
}
