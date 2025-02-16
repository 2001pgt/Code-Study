class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int longer = -1;
        int shorter = -1;
        int biggest_length = -1;
        int biggest_width = -1;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                longer = sizes[i][0];
                shorter = sizes[i][1];
            }
            else{
                longer = sizes[i][1];
                shorter = sizes[i][0];
            }
            if(biggest_length <= longer){
                biggest_length = longer;
            }
            if(biggest_width <= shorter){
                biggest_width = shorter;
            }
        }
        answer = biggest_length*biggest_width;
        return answer;
    }
}