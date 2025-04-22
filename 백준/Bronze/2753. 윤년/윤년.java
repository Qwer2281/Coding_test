import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		
		if (A % 4 == 0 && A % 100 != 0)
			System.out.println("1");
		else if (A % 400 == 0)
			System.out.println("1");
		else
			System.out.println("0");
		
		sc.close();
	}
}