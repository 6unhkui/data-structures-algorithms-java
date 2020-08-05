package chap02;

import java.util.Scanner;

public class ArrayEqual {

    private static boolean equals(int[] a, int[] b){
        if(a.length != b.length) return false;
        for(int i=0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a 배열의 요솟수 : ");
        int na = sc.nextInt();

        int[] a = new int[na];
        for(int i=0; i < na; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("b 배열의 요솟수 : ");
        int nb = sc.nextInt();

        int[] b = new int[nb];
        for(int i=0; i < nb; i++){
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        System.out.println("배열 a와 b의 요소는 " + (equals(a, b) ? "같다" : "다르다"));
        // Arrays.equals(a, b); 로도 구할 수 있음
    }
}
