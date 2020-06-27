package chap01;

import java.util.Scanner;

/**
 * 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요.
 * static void triangleLB(int b) // 왼쪽 아래가 직각인 이등변 삼각형 출력
 * static void triangleLU(int b) // 왼쪽 위가 직각인 이등변 삼각형 출력
 * static void triangleRB(int b) // 오른쪽 아래가 직각인 이등변 삼각형 출력
 * static void triangleRU(int b) // 오른쪽 위가 직각인 이등변 삼각형 출력
 */
public class Q15 {
    // 1. 왼쪽 아래가 직각인 이등변 삼각형 출력
    static void triangleLB(int b) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력");

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 2. 왼쪽 위가 직각인 이등변 삼각형 출력
    static void triangleLU(int b) {
        System.out.println("왼쪽 위가 직각인 이등변 삼각형 출력");

        for(int i = 0; i < b; i++){
            for(int j=0; j < b-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3. 오른쪽 아래가 직각인 이등변 삼각형 출력
    static void triangleRB(int b) {
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형 출력");

        for(int i = 0; i < b; i++){
            for(int j=0; j < b; j++){
                if(j+i >= b-1){
                    System.out.print("*");
                }else  System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 4. 오른쪽 아래가 직각인 이등변 삼각형 출력
    static void triangleRU(int b) {
        System.out.println("오른쪽 위가 직각인 이등변 삼각형 출력");

        for(int i = 0; i < b; i++){
            for(int j=0; j < b; j++){
                if(i <= j){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직각 사각형을 출력합니다.");
        int a;
        do {
            System.out.print("단 수 : ");
            a = sc.nextInt();
        }while (a <= 0);

        triangleLB(a);
        triangleLU(a);
        triangleRB(a);
        triangleRU(a);
    }
}
