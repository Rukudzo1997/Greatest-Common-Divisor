import java.util.Scanner;

public class EuclidGCD {
	public int euclideanGCD(int a, int b){
		if(b==0) {
			return a;
		}else {
			int aprime = a%b;
		return euclideanGCD(b, aprime);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		EuclidGCD gcd = new EuclidGCD();
		System.out.println(gcd.euclideanGCD(a,b));
		s.close();
	}
}
