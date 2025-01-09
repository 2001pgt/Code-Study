메모리: 85.7 MB, 시간: 3.94 ms
class Solution {
    public int solution(int chicken) {
        int service = 0;
        int coupon = 0;
        for(int i=0;i<chicken;i++)
        {
            coupon += 1;
            if(coupon % 10 == 0){
                service += 1;
                coupon += 1;
            }
        }
        return service;
    }
}
(0.03ms, 74.6MB)
class Solution {
    public int solution(int chicken) {
        int answer = chicken/9;
        if(chicken>1&&chicken%9==0){
            answer--;
        }


        return answer;
    }
}
