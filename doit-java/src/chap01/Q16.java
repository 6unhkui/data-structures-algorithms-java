package chap01;

import java.util.Scanner;

/**
 * n단의 파라미드를 출력하는 메서드를 작성하세요
 * static void spira(int n)
 */
public class Q16 {
    static void spira(int n) {
        int col = (n - 1) * 2 + 1;

        for(int i = 0; i < n; i++){
            for(int j=0; j < col; j++){
                if(col/2 - i <= j && col/2 + i >= j)
                    System.out.printf("*");
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
        spira(a);
    }
}
