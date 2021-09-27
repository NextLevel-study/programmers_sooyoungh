class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        for ( int i=0, j =0; i< arr.length ; i++,j++ ) {
            if ( arr[i] == ' ') {
                j=-1; continue;
            }
            
            if ( j%2 == 0 ) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        String answer = String.valueOf(arr);
        return answer;
    }
}
