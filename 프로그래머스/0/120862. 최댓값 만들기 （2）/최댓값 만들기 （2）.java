class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0]*numbers[1];
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(i == j)continue;
                else
                {
                    if(numbers[i]*numbers[j] > max){
                        max = numbers[i]*numbers[j];
                    }
                }
            }
        }
        return max;
    }
}