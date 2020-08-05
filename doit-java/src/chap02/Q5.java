package chap02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요
 * static void rcopy(int[] a, int[] b)
 */
public class Q5 {

    private static void rcopy(int[] a, int[] b){
        for(int i=0; i < b.length; i++){
            a[b.length-i-1] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원본 배열의 요솟수 : ");
        int num = sc.nextInt();

        System.out.println("원본 배열에 넣을 요소를 입력하세요.");
        int[] b = new int[num];
        for(int i=0; i < num; i++){
            System.out.print(i + " : ");
            b[i] = sc.nextInt();
        }

        int[] a = new int[num];
        rcopy(a, b);
        System.out.println("원본 배열 : " + Arrays.toString(b));
        System.out.println("카피 배열 : " + Arrays.toString(a));
    }
}
