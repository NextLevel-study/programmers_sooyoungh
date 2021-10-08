class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            
        }
        int cnt = b-a+1;
        
        if(cnt == 1 ) return (long) a;
        
        for ( int i = 0; i < cnt ; i++,a++ ){
            answer += a;
            //System.out.println(a);
        }
        
        return answer;
    }
}
