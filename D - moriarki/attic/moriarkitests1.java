
public class moriarkitests1 {

	public static void main(String[] args) {
		int N = 7;
		for(int test = 0; test < N; test++){
			int n = (int)(100*Math.random())+1;
			int[] nums = new int[n];
			for(int i = 0; i < n; i++){
				nums[i] = (int)(1000*Math.random());
			}
			StringBuilder sb = new StringBuilder();
			sb.append(nums[0]);
			for(int i = 1; i < n; i++){
				sb.append(" 0");
				sb.append(" "+nums[i]);
			}
			System.out.println(n);
			System.out.println(sb.toString().trim());
		}

	}

}
