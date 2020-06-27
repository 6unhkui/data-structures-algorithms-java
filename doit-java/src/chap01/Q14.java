package chap01;

import java.util.Scanner;

/**
 * 아래와 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
 * 단 수 : 5
 * *****
 * *****
 * *****
 * *****
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        int a;
        do {
            System.out.print("단 수 : ");
            a = sc.nextInt();
        }while (a <= 0);

        for (int i = 0; i < a; i++){
            for(int j = 0; j < a; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
