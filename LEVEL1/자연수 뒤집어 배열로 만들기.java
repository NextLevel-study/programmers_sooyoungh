import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String[] arrStr = str.split("");
        int length = arrStr.length;
        
        String[] arrReversed = new String[length];

        for (int i =0; i<length ; i++) {
            arrReversed[i] = arrStr[length-1-i]; // 순서 주의
        }

        int[] answer = new int[length];
        answer = Arrays.stream(arrReversed).mapToInt(Integer::parseInt).toArray();
        
        return answer;
    }
}
