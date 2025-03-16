class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 저점 = 0을 제외한 나머지 숫자들 중 맞는 숫자의 개수
        // 고점 = 저점에서 0의 개수만큼 맞는 숫자의 개수를 더한다.
        // 최종 맞은 숫자 갯수에 따라 등수를 입력한다.
        
        // 맞힌 숫자 개수
        int correct = 0;
        int zero = 0;
        // 0을 제외하고 나머지 숫자들 중 당첨번호와 같은 숫자가 있다면 correct++
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(lottos[j] == 0){
                    continue;
                }
                else if(lottos[j] == win_nums[i]){
                    correct++;
                }
            }
        }
        // 내 번호 중 0의 개수를 센다.
        for(int i=0;i<6;i++){
            if(lottos[i] == 0){
                zero++;
            }
        }
        int[] answer = new int[2];
        answer[0] = correct+zero;
        answer[1] = correct;
        for(int i=0;i<2;i++){
            switch (answer[i]){
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
            }
        }

        return answer;
    }
}