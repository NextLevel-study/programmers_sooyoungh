class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        
        if( length == 4 || length == 6) {
			for (int i = 0; i < length ; i++) {
				char ch = s.charAt(i);
				if(ch < '0' || ch > '9') // 수가 아니면
					answer = false;
			}
	} else answer = false;

	return answer;
        
    }
}
