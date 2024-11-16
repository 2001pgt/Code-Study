class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer1_1 = numer1*denom2;
        int numer2_2 = numer2*denom1;
        
        int totalnumer = numer1_1+numer2_2;
        int totaldenom = denom1*denom2;
        int bigger =(totalnumer>totaldenom)?totalnumer:totaldenom;
        
        while(true){
            boolean nodev = true;
            for(int i=2;i<=bigger;i++){
                if (totalnumer%i == 0 && totaldenom%i==0){
                    totalnumer /= i;
                    totaldenom /= i;
                    nodev = false;
                }
            }
            
            if (nodev == true) break;
        }
        answer[0] = totalnumer;
        answer[1] = totaldenom;
        return answer;
    }
}