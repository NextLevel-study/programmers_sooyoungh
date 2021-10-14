// 3번의 다트 기회를 길이3인 배열로 만듦 & Switch 문
class Solution {
    public int solution(String dartResult) {
	int arr[] = new int[3];
	int index = 0; // dartResult에서의 순서
    int intCnt = 0; // 기본 점수의 갯수
	
	for(int i=0; i<dartResult.length(); i++) {
        
		char dartChar = dartResult.charAt(i);
		int dartInt = Character.getNumericValue(dartChar); 
		
        // 1단계 - 기본 점수
		if(dartInt >= 0 && dartInt < 10) { 
            // 10인지 판단
			if(dartResult.charAt(i+1) == '0') {  
				dartInt = 10;
				i++;
			}
			arr[index] = dartInt;
			intCnt++;
            
		} else {
			switch(dartChar) {
			case 'S' :
				arr[index] = (int)Math.pow(arr[index], 1);
				index++;
				break;
			case 'D' :
				arr[index] = (int)Math.pow(arr[index], 2);
				index++;
				break;
			case 'T' :
				arr[index] = (int)Math.pow(arr[index], 3);
				index++;
				break;
			case '*' :
				index = index - 2 < 0 ? 0 : index - 2;
				while(index < intCnt) {
					arr[index] = arr[index] * 2; 
					index++;
				}
				break;
			case '#' :
				arr[index-1] = arr[index-1] * (-1);
				break;
			}
		}
	}
	
	return arr[0] + arr[1] + arr[2];
}
}

// Another - stack 사용
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
      
        int sum = 0;
        for (int i = 0; i < dartResult.length(); ++i) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                sum = (c - '0'); // char형을 int형으로 변환
                // 10인지 확인
                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    sum = 10;
                    i++;
                }
                stack.push(sum);
            } else {
                int prev = stack.pop();
                if (c == 'D') {
                    prev *= prev;
                } else if (c == 'T') {
                    prev = prev * prev * prev;
                } else if (c == '*') {
                    if (!stack.isEmpty()) {
                        int val = stack.pop() * 2;
                        stack.push(val);
                    }
                    prev *= 2;
                } else if (c == '#') {
                    prev *= (-1);
                }
                stack.push(prev);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }
        return totalScore;
    }
}


