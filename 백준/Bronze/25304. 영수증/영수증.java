import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long n = sc.nextLong();
		long c = 0;
		int i;
		
		for(i=1;i<=n;i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			c += a * b;
		}
		if(c == x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}