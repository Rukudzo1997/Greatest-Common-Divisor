import java.util.Scanner;
public class NaiveGCD {

	public int naiveGCDfinder(int a, int b){
		int best = 0;
		for(int i = 1; i < a+b; i++) {
			if(a%i==0 && b%i==0) {
				best = i;
			}
		}
		return best;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		NaiveGCD gcd = new NaiveGCD();
		System.out.println(gcd.naiveGCDfinder(a, b));
		s.close();
	}

}
