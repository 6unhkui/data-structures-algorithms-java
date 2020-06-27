package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("a의 값 : ");
            int a = sc.nextInt();

            int b;
            while (true) {
                System.out.print("b의 값 : ");
                b = sc.nextInt();
                if(a < b) break;
                else System.out.println("a보다 큰 값을 입력하세요!");
            }

            System.out.println("b - a는 " + (b-a) + "입니다");
        }catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다.");
            sc.close();
        }
    }
}
