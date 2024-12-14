class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(int i=0; i<str.length();i++)
        {
            switch (str.charAt(i)){
                case '3':
                    answer+=1;
                    break;
                case '6':
                    answer+=1;
                    break;
                case '9':
                    answer+=1;
            }
            
        }
        return answer;
    }
}