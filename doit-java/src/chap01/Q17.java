package chap01;

import java.util.Scanner;

/**
 * 아래 출력 결과와 같이 아래를 향한 n단의 숫자 파라미드를 출력하는 메서드를 작성하세요
 * (i행에 출력하는 숫자는 i % 10으로 구하세요)
 *  static void npira(int n)
 *  [출력 결과]
 *     1
 *    222
 *   33333
 *  4444444
 */
public class Q17 {
    static void npira(int n) {
        int col = (n - 1) * 2 + 1;

        for(int i = 0; i < n; i++){
            for(int j=0; j < col; j++){
                if(col/2 - i <= j && col/2 + i >= j)
                    System.out.printf(String.valueOf(i+1 % 10));
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("피라미드를 출력합니다.");
        int a;
        do {
            System.out.print("단 수 : ");
            a = sc.nextInt();
        }while (a <= 0);
        npira(a);
    }
}
