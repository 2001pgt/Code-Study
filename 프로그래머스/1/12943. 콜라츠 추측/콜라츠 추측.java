import java.math.BigInteger;
class Solution {
    public int solution(int num) {
        if(num == 1){
            return 0;
        }
        int answer = 0;
        long num1 = num;
        for(int i=0;i<500;i++){
            answer++;
            if(num1 % 2 == 0){
                num1 = num1 / 2;
            }
            else{
                num1 = num1*3 + 1;
            }
            System.out.println(num1);
            if(num1 == 1){
                return answer;
            }
        }
        return -1;
    }
}