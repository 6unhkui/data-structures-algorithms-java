package chap02;

import java.util.Arrays;

// 입력받은 10진수 -> 2진수 ~ 16진수로 기수 변환하여 나타냄
public class CardConvRev {
    // 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환한다.
    private static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits] = dchar.charAt(x % r);
            x /= r;
        }while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        char[] ch = new char[8];
        cardConvR(139, 16, ch);
        cardConvR(139, 2, ch);
        cardConvR(59, 2, ch);
    }
}
