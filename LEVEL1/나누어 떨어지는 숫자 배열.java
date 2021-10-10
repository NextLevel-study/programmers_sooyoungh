// My
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0;
        
        for (int i = 0, j = 0; i<arr.length ; i++) {
           // System.out.println(arr[i] % divisor);
            if (arr[i] % divisor == 0) { 
                cnt++;
                }
        }
        if (cnt == 0 ) {
            int[] arr2 = {-1}; 
            return arr2;
        }
        
        int[] answer = new int[cnt];
        
        for (int i = 0, j =0 ; i< arr.length ; i++) {
            if (arr[i] % divisor == 0) { 
                answer[j] = arr[i] ;
                j++;
            }
        }
        
        Arrays.sort(answer); 
        
        return answer;
    }
}

// other Solution - 코드는 짧은데, Strem 사용으로 시간은 더 길다
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          Arrays.sort(answer);
          return answer;
  }
}
