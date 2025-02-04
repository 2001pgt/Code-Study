class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int price1 = price; 
        
        for(int i=0;i<count;i++){
            answer += price1;
            price1 = price1+price;
            System.out.println(answer);
        }
        if(answer > money)
            return answer-money;
        else
            return 0;
    }
}