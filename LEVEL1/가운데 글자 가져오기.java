class Solution {
    public String solution(String s) {
        String answer;
        
        int length = s.length();
      
        if ( length %2 == 0) answer =  s.substring(length/2-1, length/2 + 1);
        else answer =  s.substring(length/2, length/2+1);
        
        return answer;
    }
}

//Better
class StringExercise{
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);  // 알아서 짝수면 중간 2자가 나오게끔! 
    }
}
