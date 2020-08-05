package chap02;

import java.util.Scanner;

/**
 * a의 모든 요소의 합계를 구하여 반환하는 메소드를 작성하시오.
 * static int sumOf(int[] a)
 */
public class Q3 {
    private static int sumOf(int[] a){
        int sum = 0;
        for(int i=0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int num = sc.nextInt();

        int x[] = new int[num];
        for(int i =0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("배열의 합은 " + sumOf(x) + " 입니다.");
        // Arrays.stream(a).sum(); 스트림을 이용해서도 구할 수 있음
    }
}
