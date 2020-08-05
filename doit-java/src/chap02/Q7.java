package chap02;

/**
 * 아래와 같이 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요
 * 2 |       59
 *   +-----------
 * 2 |       29 ... 1
 *   +-----------
 *       (중략)
 * 2 |       1 ... 1
 *   +-----------
 *           0 ... 1
 * 2진수로 111011입니다.
 */
public class Q7 {

    private static int cardConv(int x, int r, char[] d){
        int digit = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            System.out.println(r + "\t|\t\t" + x + (x % r != 0 ? " ... " + x % r : ""));
            d[d.length-digit++-1] = dchar.charAt(x % r);
            x /= r;
            System.out.println("\t+----------");
        }
        while (x != 0);

        System.out.println("\t\t\t" + x + (x % r != 0 ? " ... " + x % r : ""));
        return digit;
    }

    public static void main(String[] args) {
        char[] ch = new char[8];
        cardConv(139, 16, ch);
    }
}
