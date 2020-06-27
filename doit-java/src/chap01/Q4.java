package chap01;

import java.util.Scanner;

/**
 * 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.print("세 번째 숫자를 입력하세요 : ");
        int c = sc.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다");
    }

    private static int med3(int a, int b, int c){
        if(a >= b) {
            if(b >= c) return b;
            else if(a <= c) return a;
            else return c;
        }else if(a > c) {
            return a;
        }else if(b > c) {
            return c;
        }else return b;
    }
}
