import java.util.*;

public class moriarkitests {
	public static void main(String... thegame){
		int N = 100;
		for(int iter = 0; iter < N; iter++){
			int n = (int)(100*Math.random())+1;
			int[] nums = new int[n];
			for(int i = 0; i < n; i++){
				nums[i] = (int)(1000*Math.random());
			}
			int m = (int)(5*Math.random()); // a lo más 5 multiplicaciones por que si no explota
			HashSet<Integer> mults = new HashSet<>();
			for(int i = 0; i < m; i++){
				mults.add((int)(n*Math.random()));
			}
			StringBuilder sb = new StringBuilder();
			sb.append(nums[0]);
			for(int i = 1; i < n; i++){
				if(mults.contains(i)) sb.append(" 1");
				else sb.append(" 0");
				sb.append(" "+nums[i]);
			}
			System.out.println(n);
			System.out.println(sb.toString().trim());
		}
	}
}
