class Solution {
    public int solution(String s) {
        char ch = s.charAt(0);
        int answer = 0;
        
        if (ch == '-') {
            s = s.substring(1,s.length());
            answer = Integer.parseInt(s);
            answer *= -1;
        } else {
            answer = Integer.parseInt(s);
        } 
        
        return answer;
    }
}
