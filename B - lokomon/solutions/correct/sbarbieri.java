import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class sbarbieri {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String caso;
        int tarea = in.nextInt();
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] X = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                X[i][j]= in.nextInt();
            }
        }
        //Tarea 1.
        if(tarea == 1){
            int[] max = new int[N+1];
            for (int i = 0; i < M; i++) {
                max[X[i][0]]++;
            }
            int indmax = 0;
            for (int i = 0; i <= N; i++) {
                if(max[indmax] < max[i]){indmax = i;}
            }
            System.out.println(indmax);
        }
        //Tarea 2.
        if(tarea == 2){
            int[] max = new int[N+1];
            for (int i = 0; i < M; i++) {
                max[X[i][N-1]]++;
            }
            int indmax = 0;
            for (int i = 0; i <= N; i++) {
                if(max[indmax] < max[i]){indmax = i;}
            }
            System.out.println(indmax);
        }
        //Tarea 3.
        if(tarea == 3){
            int[] vals = new int[N+1];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    vals[X[i][j]]+=(N-j-1);
                }
            }
            int indmax = 0;
            for (int i = 0; i <= N; i++) {
                if(vals[indmax] < vals[i]){indmax = i;}
            }
            System.out.println(indmax);
        }
        //Tarea 4.
        if(tarea == 4){
            int[] vals = new int[N+1];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    vals[X[i][j]]+=(N-j-1);
                }
            }
            vals[0]= Integer.MAX_VALUE;
            boolean restar;
            int indmin = 0;
            for (int k = 0; k < N-1; k++) {

                indmin = 0;
                for (int i = 0; i <= N; i++) {
                    if(vals[indmin] >= vals[i] && vals[i]>= 0){indmin = i;}
                }
                for (int i = 0; i < M; i++) {
                    restar = true;
                    for (int j = 0; j < N; j++) {
                        if(restar){vals[X[i][j]]--;}
                        if(X[i][j]==indmin){restar = false;}
                    }
                }
                vals[indmin] = -1;
            }
            for (int i = 1; i <= N; i++) {
                if(vals[i] >= 0){System.out.println(i);}
            }
        }
    }
}
