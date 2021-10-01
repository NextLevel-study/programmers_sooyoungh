class Solution {
    public String solution(int n) {
        char [] arr = new char[n];
        
        for (int i =0 ; i<n ; i++) {
            if (i %2 == 1) {
                arr[i] = '박';
            } else {
                arr[i] = '수';
            }
        }

        return new String(arr);
    }
}
