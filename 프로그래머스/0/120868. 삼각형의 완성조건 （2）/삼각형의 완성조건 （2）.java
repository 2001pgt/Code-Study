class Solution {
    public int solution(int[] sides) {
        int smaller;   
        smaller = (sides[0]>sides[1] ? sides[1]:sides[0]); 
        return smaller*2 - 1;
    }
}