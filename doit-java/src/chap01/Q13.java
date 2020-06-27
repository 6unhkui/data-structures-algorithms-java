package chap01;

import java.util.Scanner;

/**
 * Q12와 동일한 표 모양에 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요.
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행의 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("열의 숫자를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.print("   |");
        for (int i = 1; i <= b; i++)
            System.out.printf("%3d", i);
        System.out.print("\n---+");
        for (int i = 1; i <= b; i++)
            System.out.print("---");

        System.out.println();
        for(int i = 1; i <= a; i++){
            System.out.print(i + "  |");
            for(int j = 1; j <= b; j++){
                System.out.print("  " + (i + j));
            }
            System.out.println();
        }
    }
}
