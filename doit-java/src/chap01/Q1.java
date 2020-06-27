package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 네 값의 최댓값을 구하는 max4 메서드를 작성하세요
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("최대값 구하기");

        try {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int a = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int b = sc.nextInt();

            System.out.print("세 번째 숫자를 입력하세요 : ");
            int c = sc.nextInt();

            System.out.print("네 번째 숫자를 입력하세요 : ");
            int d = sc.nextInt();

            System.out.println("최댓값은 " + max4(a, b, c, d) + "입니다");
        }catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
            sc.close();
        }
    }

    private static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }
}
