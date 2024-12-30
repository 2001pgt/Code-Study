class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // board의 경계값 지정
        // up,down,left,rigth마다 값+-
        // 만약 board 의 값보다 커지면 board 값으로 보정
        int rigth = board[0]/2;
        int left = -(board[0]/2);
        int up = board[1]/2;
        int down = -(board[1]/2);
        System.out.println(down);
        int[] result = {0,0};
        for(int i=0;i<keyinput.length;i++)
        {
            switch(keyinput[i]){
                case "up":
                    result[1] += 1;
                    break;
                case "down":
                    result[1] -= 1;
                    break;
                case "left":
                    result[0] -= 1;
                    break;
                case "right":
                    result[0] += 1;
            }
            if(result[0] > rigth)
            {
                result[0] = rigth;
            }
            else if(result[0] < left)
            {
                result[0] = left;
            }
            else if(result[1] > up)
            {
                result[1] = up;
            }
            else if(result[1] < down)
            {
                result[1] = down;
            }
        }
        return result;
    }
}