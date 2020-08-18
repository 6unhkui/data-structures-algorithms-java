package chap03;

import java.util.Scanner;

/**
 * 선형 검색 (보초법)
 */
public class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색한다.
    private static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key; // 키 값을 맨 끝에 넣음

        while (true){
            if(a[i] == key)
                break; // 검색 성공
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 채워넣기
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1]; // 요솟수가 num + 1인 배열 생성 (key값도 저장해야 하므로)

        for(int i=0; i<num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        // 검색할 키 값
        System.out.print("검색할 키 값 : ");
        int key = sc.nextInt();

        // 선형 검색 수행
        int idx = seqSearchSen(x, num, key);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
