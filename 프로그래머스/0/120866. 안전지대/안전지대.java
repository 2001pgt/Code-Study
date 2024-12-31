class Solution {
    public int solution(int[][] board) {
        // 1인 구역이 발견되면 
        // 위,아래,왼,오,대각선4방향 전부 해다 위치가 1이 아니라면 -1로 바꿔준다
        // 1이라면 그대로 둔다
        // 최종적으로 0인 구역만 카운트한다.
        int n = board.length;
        int answer = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                // 폭탄이라면
                if(board[i][j] == 1) 
                {
                    if(i-1>=0 && board[i-1][j] != 1) //위
                    {
                        board[i-1][j] = -1;
                    }
                    if(i+1<n && board[i+1][j] != 1 ) //아래
                    {
                        board[i+1][j] = -1;
                    }
                    if(j-1>=0 && board[i][j-1] != 1) //왼
                    {
                        board[i][j-1] = -1;
                    }
                    if(j+1<n && board[i][j+1] != 1) //오
                    {
                        board[i][j+1] = -1;
                    }
                    if(i-1>=0 && j+1<n && board[i-1][j+1] != 1) //위오
                    {
                        board[i-1][j+1] = -1;
                    }
                    if(i-1>=0 && j-1>=0 && board[i-1][j-1] != 1) //위왼
                    {
                        board[i-1][j-1] = -1;
                    }
                    if(i+1<n && j+1<n && board[i+1][j+1] != 1) //아래오
                    {
                        board[i+1][j+1] = -1;
                    }
                    if(i+1<n && j-1>=0 && board[i+1][j-1] != 1) //아래왼
                    {
                        board[i+1][j-1] = -1;
                    }
                }
            }
        }
         for(int i=0;i<n;i++)
         {
           for(int j=0;j<n;j++)
            {
                if(board[i][j] == 0)
                {
                    answer++;
                }
            }  
         }
        
        return answer;
    }
}