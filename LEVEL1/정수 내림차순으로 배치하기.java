import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] arrStr = str.split("");
        Arrays.sort(arrStr, Collections.reverseOrder());
        
        str = String.join("", arrStr);
        System.out.println(str);
        
        long answer = Long.parseLong(str);
 
        return answer;
    }
}
