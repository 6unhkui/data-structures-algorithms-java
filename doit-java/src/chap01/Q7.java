package chap01;

import java.util.Scanner;

/**
 * n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'을 출력하는 프로그램을 작성하세요
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        StringBuilder sb = new StringBuilder();
        while (i <= n) {
            sum += i;
            if(i == n) {
                sb.append(i + " = " + sum);
                System.out.println(sb.toString());
            }else sb.append(i + " + ");
            i++;
        }

    }
}
