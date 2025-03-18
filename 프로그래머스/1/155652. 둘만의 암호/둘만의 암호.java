class Solution {
    public String solution(String s, String skip, int index) {
        // s를 문자 배열로 변환
        // for each문으로 문자 변환 시작
        // 만약 넘길때 skip에 해당되는 문자를 만나면 index 값 +1 해서 한번더 스킵
        // 변환된 문자는 Stringbuilder 객체에 추가한다.
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        char[] skipArray = skip.toCharArray();
        for(char c : charArray){
            for(int i=0;i<index;i++){
                c = (char)(c+1);
                if(c >122){
                    c = (char)(c-26);
                }
                for(int j=0;j<index;j++){
                    for(char sk :skipArray){
                        if(c == sk){
                            c = (char)(c+1);
                            if(c >122){
                                c = (char)(c-26);
                            }
                        // System.out.println(c);
                        }   
                    }
                }   
            }
            // System.out.println(c);
            sb.append(c);
        }
        return sb.toString();
    }
}