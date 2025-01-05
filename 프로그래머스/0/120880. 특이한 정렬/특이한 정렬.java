import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i=0;i<numlist.length;i++)
        {
            for(int j=1;j<numlist.length;j++)
            {
                int abs1 =  Math.abs(n - numlist[j]);
                int abs2 =  Math.abs(n - numlist[j-1]);
                if(abs1 == abs2)
                {
                    if(numlist[j]>numlist[j-1])
                    {
                        int tmp = numlist[j];
                        numlist[j] = numlist[j-1];
                        numlist[j-1] = tmp;
                    }
                }
                else if(abs1 < abs2)
                {
                    int tmp = numlist[j];
                    numlist[j] = numlist[j-1];
                    numlist[j-1] = tmp;
                }
            }
        }
        return numlist;
    }
}