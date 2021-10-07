// Solution1 - String 배열에서 정렬
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        String[] answer = new String[length];
        
        // 앞에 붙이기
        for (int i = 0 ; i<length; i++) {
           answer[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(answer);
        
         // 앞문자 제거
        for (int i = 0 ; i<length; i++) {
           answer[i] = answer[i].substring(1);
        }
        
        return answer;
    }
}


// Solution2 - comparing 사용
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
    }
}

