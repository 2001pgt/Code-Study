import java.util.ArrayList;
class Solution {
    public int[] solution(int[][] score) {
        // for문을 돌려서 int[i]의 평균보다 큰수가 나올때마다 +1
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=0;i<score.length;i++)
        {
            for(int j=0;j<score.length;j++)
            {
                if(i!=j)
                {
                    if((score[i][0]+score[i][1]) < (score[j][0]+score[j][1]))
                    {
                        count++;
                    }
                }
            }
            list.add(count);
            count = 1;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}