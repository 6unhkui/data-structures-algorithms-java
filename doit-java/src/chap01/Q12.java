package chap01;

import java.util.Scanner;

/**
 * 아래와 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 작성하는 프로그램을 작성하세요.
 *   | 1   2   3   4   5   6   7   8   9
 * --+-----------------------------------
 * 1 | 1   2   3   4   5   6   7   8   9
 * 2 | 2   4   6   8  10  12  14  16  18
 * 3 | 3   6   9  12  15  18  21  24  27
 * 4 | 4   8  12  16  20  24  28  32  36
 * ...
 * 9 | 9  18  27  36  45  54  63  72  81
 */
public class Q12 {
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
                System.out.print("  " + i * j );
            }
            System.out.println();
        }
    }
}
