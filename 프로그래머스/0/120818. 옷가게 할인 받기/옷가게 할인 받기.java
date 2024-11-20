class Solution {
    public int solution(int price) {
        while(true){
            // 50만원 이상일 때
            if(price>=500000){
                price = price*80/100;
                break;
            }
            // 30만원 이상일 때
            if(price>=300000){
                price = price*90/100;
                break;
            }
            // 10만원 이상일 때
            if(price>=100000){
                price = price*95/100;
                break;
            }
            // 반복하지 않고 종료
            break;
        }
        
        return price;
    }
}