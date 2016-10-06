import java.util.HashSet;

public class moriarkitest3 {

	public static void main(String[] args) {
		int n = 50; int p = 7;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = (p*(i+p))%n+1;
		}
		HashSet<Integer> mults = new HashSet<>();
		for(int i = 0; i < 20; i++){
			mults.add((int)(n*Math.random()));
		}
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		for(int i = 1; i < n; i++){
			if(mults.contains(i)) sb.append(" 1");
			else sb.append(" 0");
			sb.append(" "+arr[i]);
		}
		System.out.println(n);
		System.out.println(sb.toString().trim());
	}

}
