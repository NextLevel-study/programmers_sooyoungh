class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp;
        
        // m을 큰 수로
        if(m<n) {
              temp = n;
              n = m;
              m = temp;
        }

        int GCD = GCD(m,n);
        answer[0] = GCD;
        answer[1] = m * n / GCD;
        
        return answer;
    }
    
    // GCD(m, n) = GCD(n, r) = GCD(r, 0) = r
    public int GCD(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return GCD(n, m % n);
    }
}
