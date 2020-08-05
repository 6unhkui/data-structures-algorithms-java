package chap02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 요소를 역순으로 정렬하는 과정을 하나의 프로그램으로 작성하세요.
 */
public class Q2 {

    private static void swap(int[] a, int idx1, int idx2) {
        System.out.println(Arrays.toString(a));
        System.out.println(a[idx1] + "과(와) " + a[idx2] + "를 교환합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    private static void reverse(int[] a){
        for(int i=0; i < a.length/2; i++){
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟 수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for(int i=0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);
        System.out.println("역순 정렬을 마쳤습니다.");
        System.out.println(Arrays.toString(x));
    }
}
