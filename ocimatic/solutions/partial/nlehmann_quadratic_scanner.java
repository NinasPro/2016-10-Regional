import java.util.*;

class nlehmann_quadratic_scanner {

    static boolean contains(int a1, int a2, int b1, int b2) {
        return a1 <= b1 && b2 <= a2;
    }
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] vec1 = new int[N];
        int[] vec2 = new int[N];
        for (int i = 0; i < N; ++i) {
            vec1[i] = in.nextInt();
            vec2[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                if (i != j && contains(vec1[j], vec2[j], vec1[i], vec2[i])) {
                    count++;
                    break;
                }
        System.out.println(count);
    }
}
