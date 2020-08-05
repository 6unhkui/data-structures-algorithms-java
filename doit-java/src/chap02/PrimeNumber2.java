package chap02;

import java.util.Arrays;

// 알고리즘 개선 1.
// 소수는 2를 제외하고 모두 소수이다
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 2는 소수
        for(int n=3; n <= 1000; n += 2) { // 홀수만 진행
            int i;
            for(i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누어봄
                counter++;
                if(n % prime[i] == 0) // 나누어 떨어지면 소수가 아니다
                    break;
            }

            if(ptr == i) prime[ptr++] = n; // 마지막까지 나누어떨어지지 않으면 소수
        }

        int[] res = Arrays.copyOfRange(prime, 0, ptr);
        System.out.println("소수 : " + Arrays.toString(res));
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
