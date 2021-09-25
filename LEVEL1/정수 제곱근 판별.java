class Solution {
    public long solution(long n) {
        if (n <= 0) return -1;
        
        for (long i=1; i <= n ; i++) {
            if ( i * i  == n ) return (i+1) * (i+1);
        }
        
        return -1;
    }
}
