package chap02;

import java.util.Scanner;

/**
 * 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요
 * static int cardConv(int x, int r, char[] d)
 */
public class Q6 {
    private static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[d.length-digits++-1] = dchar.charAt(x % r);
            x /= r;
        }while (x != 0);
        return digits;
    }

    private static void printCard(int x, int r, char[] d) {
        int digit = cardConv(x, r, d);

        String str = "";
        if(r == 16) str += "0x";
        for(int i=d.length - digit; i < d.length; i++){
            str += d[i];
        }
        str += "(" + r + ")";
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10진수를 기수 변환 합니다.");

        int de = 0;
        do {
            System.out.print("변환할 10진수 숫자를 입력하세요(양수) : ");
            de = sc.nextInt();
        }while (de < 0);

        int cd = 0;
        do {
            System.out.print("어떤 진수로 변환 할까요?(2 ~ 36) : ");
            cd = sc.nextInt();
        }while (cd < 2 || cd > 36);

        char[] ch = new char[32];
        printCard(de, cd, ch);
    }
}
