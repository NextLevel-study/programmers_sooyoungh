import java.util.stream.Stream;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int[] arrInt = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray(); //스트림으로 돌린 후 array로 변환
    
        int count = 0;
        for (int i=0; i<arrInt.length ; i++) {
            count += arrInt[i];
        }
        
        if (x%count != 0) {
            answer = false;
        }
        
        return answer;
    }
}
