class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 발음 가능한 단어 목록
        String[] validWords = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String original = word; // 원래 단어 저장
            for (String valid : validWords) {
                // 발음 가능한 단어를 빈 문자열로 치환
                word = word.replace(valid, " ");
            }
            // 치환된 단어에서 모든 공백을 제거
            word = word.replace(" ", "");
            // 치환 결과가 빈 문자열이면 발음 가능한 단어로 판단
            if (word.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}
