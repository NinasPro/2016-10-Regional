import java.io.*;
import java.util.StringTokenizer;

class Main {
    static public void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int th = Integer.parseInt(st.nextToken());
        int tm = Integer.parseInt(st.nextToken());
        int ts = th * 3600 + tm * 60;

        int sn = Integer.parseInt(br.readLine());

        int sc;
        for (sc = 0; sc < sn; sc++) {
            st = new StringTokenizer(br.readLine());
            int sm = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());
            ts -= 60 * sm + ss;
            if (ts < 0)
                break;
        }
        System.out.println(sc);
    }
}
