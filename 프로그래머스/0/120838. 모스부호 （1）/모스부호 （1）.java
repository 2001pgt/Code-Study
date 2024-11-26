class Solution {
    public String solution(String letter) {
        String answer = "";
        String code = "";    
        for(int i=0; i<letter.length();i++){
            if(letter.charAt(i) == ' '){
                switch (code) {
                    case ".-":
                        answer += 'a';
                        break;
                    case "-...":
                        answer += 'b';
                        break;
                    case "-.-.":
                        answer += 'c';
                        break;
                    case "-..":
                        answer += 'd';
                        break;
                    case ".":
                        answer += 'e';
                        break;
                    case "..-.":
                        answer += 'f';
                        break;
                    case "--.":
                        answer += 'g';
                        break;
                    case "....":
                        answer += 'h';
                        break;
                    case "..":
                        answer += 'i';
                        break;
                    case ".---":
                        answer += 'j';
                        break;
                    case "-.-":
                        answer += 'k';
                        break;
                    case ".-..":
                        answer += 'l';
                        break;
                    case "--":
                        answer += 'm';
                        break;
                    case "-.":
                        answer += 'n';
                        break;
                    case "---":
                        answer += 'o';
                        break;
                    case ".--.":
                        answer += 'p';
                        break;
                    case "--.-":
                        answer += 'q';
                        break;
                    case ".-.":
                        answer += 'r';
                        break;
                    case "...":
                        answer += 's';
                        break;
                    case "-":
                        answer += 't';
                        break;
                    case "..-":
                        answer += 'u';
                        break;
                    case "...-":
                        answer += 'v';
                        break;
                    case ".--":
                        answer += 'w';
                        break;
                    case "-..-":
                        answer += 'x';
                        break;
                    case "-.--":
                        answer += 'y';
                        break;
                    case "--..":
                        answer += 'z';   
                }
                code ="";
            }
            else{
                code += letter.charAt(i);
            }
            
        }
        switch (code) {
                    case ".-":
                        answer += 'a';
                        break;
                    case "-...":
                        answer += 'b';
                        break;
                    case "-.-.":
                        answer += 'c';
                        break;
                    case "-..":
                        answer += 'd';
                        break;
                    case ".":
                        answer += 'e';
                        break;
                    case "..-.":
                        answer += 'f';
                        break;
                    case "--.":
                        answer += 'g';
                        break;
                    case "....":
                        answer += 'h';
                        break;
                    case "..":
                        answer += 'i';
                        break;
                    case ".---":
                        answer += 'j';
                        break;
                    case "-.-":
                        answer += 'k';
                        break;
                    case ".-..":
                        answer += 'l';
                        break;
                    case "--":
                        answer += 'm';
                        break;
                    case "-.":
                        answer += 'n';
                        break;
                    case "---":
                        answer += 'o';
                        break;
                    case ".--.":
                        answer += 'p';
                        break;
                    case "--.-":
                        answer += 'q';
                        break;
                    case ".-.":
                        answer += 'r';
                        break;
                    case "...":
                        answer += 's';
                        break;
                    case "-":
                        answer += 't';
                        break;
                    case "..-":
                        answer += 'u';
                        break;
                    case "...-":
                        answer += 'v';
                        break;
                    case ".--":
                        answer += 'w';
                        break;
                    case "-..-":
                        answer += 'x';
                        break;
                    case "-.--":
                        answer += 'y';
                        break;
                    case "--..":
                        answer += 'z';     
                }       
        return answer;
    }
}

// 다른 풀이
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");

        for(int i=0;i<word.length;i++){
            for(int j=0;j<morse.length;j++){
                if(word[i].equals(morse[j])) answer+=(char)(j+97); // 아스키코드를 이용하여 인덱스에 +97 을하면 모스부호에 알맞은 알파벳이 나오도록함
            }
        }

        return answer;
    }
}
