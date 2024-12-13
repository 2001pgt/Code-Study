class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 101;
        // 수가 n보다 크다면 수 - n
        // 작으면 n-수
        // 저 값이 min값 보다 작으면 min 대체하고 가까운 숫자도 그 숫자로 변경
        for(int i=0;i<array.length;i++)
        {   
            int tmp;
            if(array[i]>=n)
            {
                tmp = array[i]-n;    
            }
            else
            {
                tmp = n - array[i];
            }
            if(tmp < min)
            {
                min = tmp;
                answer = array[i];
            }
            else if(tmp == min)
            {
                if(array[i]<answer)
                {
                    answer = array[i];
                }
            }
            
        }
        return answer;
    }
}