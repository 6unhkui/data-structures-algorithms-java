package chap01;

import java.util.Scanner;

/**
 * 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요
 * static int sumof(int a, int b)
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(a, b) + "입니다");;
    }

    private static int sumof(int a, int b){
        int sum = 0;
        if(a < b) {
            sum = ((a + b) * b) / 2;
        }else if(a > b) {
            sum = ((b + a) * a) / 2;
        }
        return sum;
    }
}
