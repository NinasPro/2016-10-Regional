import java.util.*;
public class mmunos {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int res = 0;
		int n = seer.nextInt();
		int curr = seer.nextInt();
		for(int i = 1; i < n; i++){
			int c = seer.nextInt();
			int k = seer.nextInt();
			if(c == 1){
				curr *= k;
			}
			else{
				res += curr;
				curr = k;
			}
		}
		System.out.println(res + curr);
	}

}
