class Solution {
    public int[][] solution(int[] num_list, int n) {
        int size = num_list.length/n; // 2차원 배열의 행의 크기
        int[][] answer = new int[size][n]; // 매개변수에 맞춰 새2차원 배열 선언
        int index = 0; // num_list이 인덱스
        for(int i=0;i<size;i++){
            for(int j=0;j<n;j++){
                // 2차원 배열의 값을 처음부터 채워 넣기
                // 이때 num_list의 첫번때 원소부터 넣어야 되므로 index++
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}