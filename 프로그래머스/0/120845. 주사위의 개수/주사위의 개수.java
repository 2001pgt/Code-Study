class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int x,y,z;
        x = (box[0]-box[0]%n)/n;
        y = (box[1]-box[1]%n)/n;
        z = (box[2]-box[2]%n)/n;
        answer = x * y * z;
        return answer;
    }
}