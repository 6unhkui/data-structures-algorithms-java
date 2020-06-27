package chap01;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            System.out.println("현재값 : " + i + "\t 누적 : " + sum);
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다");
    }
}
