import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paulsen {
	static long t;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		t=Long.parseLong(st.nextToken())*3600;
		t+=Long.parseLong(st.nextToken())*60;
		int n=Integer.parseInt(br.readLine());
		int ans=0;
		long crt=0;
		while(n-->0){
			st=new StringTokenizer(br.readLine());
			crt+=60*Long.parseLong(st.nextToken());
			crt+=Long.parseLong(st.nextToken());
			if (crt>t) break;
			ans++;
		}
		System.out.println(ans);
	}
}