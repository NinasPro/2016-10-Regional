import java.util.*;
class nlehmann_scanner {
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
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Pair[] vec = new Pair[N];
        for (int i = 0; i < N; ++i) {
            int a, b;
            a = in.nextInt();
            b = in.nextInt();
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
