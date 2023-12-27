import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = ""; 
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger sum = num1.add(num2);
        
        answer = String.valueOf(sum);
        
        return answer;
    }
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "18446744073709551615"
// 무슨 에러인가 알아봤더니 수가 너무 커서 그렇다고 한다. Long으로 바꿔도 해결불가

// BigInteger라는 것이 있음 //  이 클래스는 정수의 크기에 제한을 두지 않아서 매우 큰 값을 다룰 수 있다고 한다. 
// 정수형으로의 타입 변환이 필요하지 않고 문자열 형태로 숫자를 입력받아 내부적으로 해당 문자열을 정수로 변환하여 처리한다. 
// 그리고 +, -. *, /, %와 같은 연산자를 사용하지 않고 각각의 메서드를 사용해햐 한다. 

// 덧셈
// BigInteger sum = numA.add(numB);

// 뺄셈
// BigInteger difference = numA.subtract(numB);

// 곱셈
// BigInteger product = numA.multiply(numB);

// 나눗셈
// BigInteger division = numA.divide(numB); 
// => numA / numB

// 나머지 연산
// BigInteger remainder = numA.divide(numB);
// => numA % numB
