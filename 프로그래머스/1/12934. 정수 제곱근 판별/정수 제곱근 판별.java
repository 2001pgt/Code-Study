class Solution {
    public long solution(long n) {
        double result = Math.sqrt(n);
        if(result == Math.floor(result)){
            return(long)(result+1)*(long)(result+1);
        }
        return -1;
    }
}