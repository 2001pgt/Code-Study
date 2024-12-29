class Solution {
    public int solution(int[] array) {
        // 배열의 원소를 추출해서 문자열로 변경
        // 문자열을 다시 문자 배열로 변경 거기서 '7'의 횟수를 카운트 
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            String str = String.valueOf(array[i]);
            char[] charArray = str.toCharArray();
            for(int j=0;j<str.length();j++)
            {
                if(charArray[j] == '7')
                {
                    count++;
                }
            }
        }
        return count;
    }
}