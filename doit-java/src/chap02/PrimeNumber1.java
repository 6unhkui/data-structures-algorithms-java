package chap02;

// 1000 이하의 소수 구하기
// 소수의 조건 : 자신과 1 이외의 정수로 나누어 떨어지지 않는 정수
// 즉, 소수는 2부터 n-1까지의 어떤 정수로도 나누어 떨어지지 않는다.
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        for(int n = 2; n <= 1000; n++) {
            int i;
            for(i = 2; i < n; i++) {
                counter++;
                if(n % i == 0) break; // 나누어 떨어지면 소수가 아님
            }
            if(n == i) System.out.println(n); // 마지막까지 나누어 떨어지지 않음(=소수)
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
