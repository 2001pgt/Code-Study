class Solution {
    public int solution(int M, int N) {
        int A;
        int B;
        if(N<=M){
            A = M;
            B = N;
        }
        else{
            A = N;
            B = M;
        }
        
        int answer = (B-1)+(A-1)*B;
        return answer;
    }
}