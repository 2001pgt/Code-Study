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