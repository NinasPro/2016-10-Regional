import java.util.Scanner;
import java.math.*;
public class moriarkiverifier {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		while(seer.hasNext()){
			BigInteger res = big(0);
			int n = seer.nextInt();
			BigInteger curr = big(seer.nextInt());
			for(int i = 1; i < n; i++){
				long c = seer.nextInt();
				BigInteger k = big(seer.nextInt());
				if(c == 1){
					curr = m(curr,k);
				}
				else{
					res = s(res,curr);
					curr = k;
				}
			}
			res = s(res,curr);
			if(res.compareTo(big(1000000000)) > 0) System.out.println(res+" no sirve");
			else System.out.println(res);
		}
	}
	static BigInteger big(long x){
		return BigInteger.valueOf(x);
	}
	static BigInteger s(BigInteger x, BigInteger y){
		return x.add(y);
	}
	static BigInteger m(BigInteger x, BigInteger y){
		return x.multiply(y);
	}

}
