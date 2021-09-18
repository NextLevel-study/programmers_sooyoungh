class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        
        char[] charArr = phone_number.toCharArray();
        
        for (int i=0; i<length-4;i++) {
            charArr[i] = '*';
        }
        
        String answer = String.valueOf(charArr);
        return answer;
    }
}
