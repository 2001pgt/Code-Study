class Solution {
    public int solution(int i, int j, int k) {
        // i~j사이의 수를 문자열로 만든다.
        // 그 수의 문자를 하나씩 k와 비교해 같을때 마다 answer++
        int answer = 0;
        for(int x=i;x<=j;x++){
            String str = String.valueOf(x);
            for(int y=0;y<str.length();y++){
                if(String.valueOf(str.charAt(y)).equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}