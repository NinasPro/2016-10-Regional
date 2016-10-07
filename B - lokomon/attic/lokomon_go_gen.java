import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lokomon_go_gen {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		String caso;
		int tarea = in.nextInt();
		for (int aa = 0; aa <= 9; aa++) {
			caso = "0"+aa;
			int N = in.nextInt();
			int M = in.nextInt();
			PrintWriter PP = new PrintWriter(caso+".in");
			PrintWriter OO = new PrintWriter(caso+".sol");
			int[][] X = new int[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					X[i][j]=j+1;
				}
			}
			int piv;
			PP.println(N+" "+M);
			//generar permutacion aleatoria
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					int x = j+(int) Math.floor(Math.random()*(N-j));
					piv = X[i][x]; X[i][x]= X[i][j]; X[i][j]=piv;
					PP.print(X[i][j]);
					if(j != N-1){PP.print(" ");}
					else{PP.println();}
				}
			}
			PP.close();
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
			OO.println(indmax);
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
			OO.println(indmax);
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
			OO.println(indmax);
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
					if(vals[i] >= 0){OO.println(i);}
				}
			}
			OO.close();
		}
	}
}
