package chap01;

import java.util.Scanner;

/**
 * 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수의 합을 구하는 프로그램을 작성하세요
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = ((1 + n) * n) / 2;
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다");
    }
}
