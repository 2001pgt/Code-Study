class Solution {
    public int solution(int[] array, int height) {
        // for문 돌려서 해당 원소가 키보다 크면 answer++
        int answer = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>height)
            {
                answer++;
            }
        }
        return answer;
    }
}