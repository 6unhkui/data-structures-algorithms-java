package chap02;

import java.util.Arrays;

/**
 * 배열의 복제
 * 배열 이름.clone();
 */
public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        System.out.print("a = ");
        System.out.println(Arrays.toString(a));

        System.out.print("b = ");
        System.out.println(Arrays.toString(b));
    }
}
