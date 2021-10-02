class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = true;
        
        for (int i = 2; i <= n ; i++ ) {
            for (int j = 2; j <= Math.sqrt(i) ; j++ ) {
                if (  i % j == 0 ) {
                    flag = false; break;
                }
            }
            if(flag == true) answer++;
            flag = true; 
        }

        return answer;
    }
}

// BETTER
class Solution {
    public int solution(int n) {
        int answer = 0;
        int arr[] = new int[n+1];
        arr[0] = 0; arr[1] = 0;
        
        // 초기화
        for (int i = 2 ; i <= n; i++) { arr[i] = i; }
        
        // 소수 아닌것들은 0으로 만들자
        for (int i = 2 ; i <= (int)Math.sqrt(n) ; i++) {
            // 이미 소수가 아닌거면 패스
            if(arr[i] == 0) continue;
            // 소수의 배수(=소수가 아님)들은 다 0으로 만들자
            for (int j = 2 * i ; j <= n; j+=i) {
                arr[j] = 0;
            }
        }

        for (int i = 0; i <= n ; i++ ) {
            if (arr[i] != 0) answer++;
        }

        return answer;
    }
}
