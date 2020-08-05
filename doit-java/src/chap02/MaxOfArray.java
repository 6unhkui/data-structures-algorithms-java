package chap02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 요소의 최댓값 구하기
 */
public class MaxOfArray {
    private static int maxOf(int[] a) {
       int max = a[0];
       for(int i=0; i < a.length; i++) {
           if (max < a[i]) max = a[i];
       }
       return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.println("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];
        System.out.println("키 값은 아래와 같습니다.");
        for(int i=0; i < num; i++){
            System.out.print("height[" + i + "] : ");
            height[i] = sc.nextInt();
        }

        System.out.print("입력된 숫자");
        System.out.println(Arrays.toString(height));
        System.out.print(" 중 최댓값은 ");
        System.out.print(maxOf(height) + "입니다.");
    }
}
