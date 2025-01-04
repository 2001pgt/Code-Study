class Solution {
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int solution(int a, int b) {
        int gcd = findGCD(a,b);
        int b_gcd = b / gcd;
        while(true)
        {   
            if(b_gcd % 2 == 0)
            {
                b_gcd /= 2;
            }
            else if(b_gcd % 5 == 0)
            {
                b_gcd /=5;
            }
            else
            {
                if(b_gcd != 1)
                {
                    return 2;
                }
                else
                {
                    break;
                }
            }       
        }
        return 1;
    }
}