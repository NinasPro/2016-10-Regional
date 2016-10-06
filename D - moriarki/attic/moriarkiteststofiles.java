import java.io.*;
import java.util.*;
public class moriarkiteststofiles {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = 1;
		while(true){
			String line = br.readLine(); if(line == null) break;
			PrintWriter pw = new PrintWriter(new File(test+".in"));
			pw.println(line);
			pw.println(br.readLine());
			pw.close();
			test++;
		}

	}

}
