package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 세 값의 최솟값을 구하는 min3 메서드를 작성하세요
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("최솟값 구하기");

        try {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int a = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int b = sc.nextInt();

            System.out.print("세 번째 숫자를 입력하세요 : ");
            int c = sc.nextInt();

            System.out.println("최솟값은 " + min3(a, b, c) + "입니다");
        }catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
            sc.close();
        }
    }

    private static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return min;
    }
}
