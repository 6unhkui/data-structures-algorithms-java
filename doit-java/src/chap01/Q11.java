package chap01;

import java.util.Scanner;

/**
 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 135를 입력하면 '그 수는 3자리 입니다' 라고 출력하고
 * 1314를 입력하면 '그 수는 4자리 입니다.' 라고 출력하면 됩니다.
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            a = sc.nextInt();
            if(a > 0) break;
            else System.out.println("양의 정수만 입력 가능합니다.");
        }

        //System.out.println("그 수는 " + String.valueOf(a).length() + "자리 입니다.");
        System.out.println("그 수는 " + ((int)Math.log10(a)+1) + "자리 입니다.");
    }
}
