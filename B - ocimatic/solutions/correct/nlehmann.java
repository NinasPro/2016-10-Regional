import java.util.*;
import java.io.*;
class nlehmann {
    static class Pair implements Comparable<Pair>{
        int a, b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair rhs) {
            if (a == rhs.a)
                return rhs.b - b;
            return a - rhs.a;
        }
    }
    static public void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st;

        Pair[] vec = new Pair[N];
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            int a, b;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            vec[i] = new Pair(a, b);
        }
        Arrays.sort(vec);
        int rightmost = -1;
        int count = 0;
        for (Pair p : vec) {
            if (p.b > rightmost)
                rightmost = p.b;
            else
                count++;
        }
        System.out.println(count);
    }
}
