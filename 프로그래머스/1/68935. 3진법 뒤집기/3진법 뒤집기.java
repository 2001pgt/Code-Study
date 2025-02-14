
class Solution {
    public int solution(int n) {
        int answer = 0;
        // 10 -> 3
        String base3 = Integer.toString(n, 3);
        String reversed = new StringBuilder(base3).reverse().toString();
        int decimalFromBase3 = Integer.parseInt(reversed, 3);
        
        return decimalFromBase3;
    }
}