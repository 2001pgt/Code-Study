class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] allowed = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling) {
            int index = 0;
            String prev = "";
            boolean valid = true;
            
            while(index < word.length()) {
                boolean found = false;
                // allowed 단어들을 순회하며 현재 index에서 시작하는지 확인
                for(String s : allowed) {
                    // 이전에 사용한 단어와 같으면 건너뜁니다.
                    if(s.equals(prev)) continue;
                    
                    // 현재 위치에서 s로 시작하면
                    if(word.startsWith(s, index)) {
                        found = true;
                        prev = s;              // 이전 발음으로 저장
                        index += s.length();   // 인덱스를 단어 길이만큼 이동
                        break;
                    }
                }
                // allowed 단어들 중 어느 것도 매칭되지 않으면 유효하지 않은 문자열
                if(!found) {
                    valid = false;
                    break;
                }
            }
            if(valid) answer++;
        }
        
        return answer;
    }
}
