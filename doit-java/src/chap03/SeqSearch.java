package chap03;

import java.util.Scanner;

/**
 * 선형 검색
 */
public class SeqSearch {

    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
    private static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        while (true){
            if(i == n)
                return -1; // 검색 실패
            if(a[i] == key)
                return i; // 검색 성공
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 채워넣기
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열 생성

        for(int i=0; i<num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        // 검색할 키 값
        System.out.print("검색할 키 값 : ");
        int key = sc.nextInt();

        // 선형 검색 수행
        int idx = seqSearch(x, num, key);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
