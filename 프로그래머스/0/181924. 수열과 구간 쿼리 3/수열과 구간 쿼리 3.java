class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
    
        int swap1,swap2,tmp;
        for(int i=0;i<queries.length;i++){
            for (int j=0;j<1;j++){
                swap1 = queries[i][j];
                swap2 = queries[i][j+1];
                tmp = arr[swap1];
                arr[swap1] = arr[swap2];
                arr[swap2] = tmp;
            }
        }
        answer = arr;
        return answer;
    }
}