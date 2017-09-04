import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lokomon_go_gen2 {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		String caso;
		int tarea = in.nextInt();
    int N = in.nextInt();
    int M = in.nextInt();

    int[][] X = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        X[i][j]=j+1;
      }
    }
    int piv;
    System.out.println(tarea + " " + N + " " + M);
    //generar permutacion aleatoria
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        int x = j+(int) Math.floor(Math.random()*(N-j));
        piv = X[i][x]; X[i][x]= X[i][j]; X[i][j]=piv;
        System.out.print(X[i][j]);
        if(j != N-1){System.out.print(" ");}
        else{System.out.println();}
      }
    }
	}
}
