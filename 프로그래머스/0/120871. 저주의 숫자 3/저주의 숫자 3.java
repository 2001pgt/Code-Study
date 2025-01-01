class Solution {
    public int solution(int n) {
        int num = 0;
        for(int i=0;i<n;i++)
        {
            num++;
            while(true)
            {   
                boolean istrue = true;
                if(String.valueOf(num).contains("3"))
                {
                    num++;
                    istrue = false;
                    continue;
                }
                else if(num%3 == 0){
                    num++;
                    istrue = false;
                    continue;
                }
                if(istrue)
                {
                    break;
                }
            }
            
        }
        
        return num;
    }
}