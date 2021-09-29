class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for (int i=0; i< s.length() ; i++ )
        {
            if (arr[i] == ' ') {
                 arr[i] = ' '; continue;
            }
            
            if (arr[i] >='a' && arr[i] <= 'z') {
                if (arr[i] + n > 'z') {
                    arr[i] = (char) ( arr[i] + n - 26) ;
                } else {
                     arr[i] += n;
                }
            } else if (arr[i] >='A' && arr[i] <= 'Z') {
                if (arr[i] + n > 'Z') {
                    arr[i] = (char) ( arr[i] + n - 26);
                } else {
                     arr[i] += n;
                }
            }
            
        }        
        
        String answer = String.valueOf(arr);
        return answer;
    }
}
