class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num = x;
        int result = 0;
        while(num>0){
            int sum = num % 10;
            result += sum;
            num /= 10;
        }
        if(x % result == 0){
            answer = true;
        }
        return answer;
    }
}