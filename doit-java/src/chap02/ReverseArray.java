package chap02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 요소 역순으로 정렬하기
 */
public class ReverseArray {
    // 배열 a의 요소 a[idx1]과 a[idx2]의 값을 바꿈
    private static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    private static void reverse(int[] a) {
        for(int i=0; i < a.length / 2; i++){
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟 수 : ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for(int i=0; i < num; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        reverse(a); // 배열 요소를 역순으로 정렬

        System.out.println("배열 요소를 역순으로 정렬 하였습니다.");
        System.out.println("결과 : ");
        System.out.println(Arrays.toString(a));
    }
}
