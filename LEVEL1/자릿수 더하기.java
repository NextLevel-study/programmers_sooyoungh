import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = "" + n;
        int answer = 0;
        
        for (int i = 0; i<str.length() ; i++ ) {
            answer += (int)n%10;
            n /= 10;
        }

        return answer;
    }
}
