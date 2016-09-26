import java.io.*;
import java.util.Scanner;


class Main {
    static public void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);

        int th = s.nextInt();
        int tm = s.nextInt();
        int ts = th * 3600 + tm * 60;

        int sc, sn = s.nextInt();
        for (sc = 0; sc < sn; sc++) {
            int sm = s.nextInt();
            int ss = s.nextInt();
            ts -= 60 * sm + ss;
            if (ts < 0)
                break;
        }

        System.out.println(sc);
    }
}
