class Solution {
    boolean solution(String s) {
        int cnt_p = 0; int cnt_y = 0;

        for ( int i =0; i<s.length() ; i++ ){
            if (s.charAt(i) == 'p' ||  s.charAt(i) == 'P' ) cnt_p++;
            if (s.charAt(i) == 'y' ||  s.charAt(i) == 'Y' ) cnt_y++;
        }
        
        if ( cnt_p == cnt_y ) return true;
        return false;
    }
}
