
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

// 다른 풀이
class Solution {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }
}
