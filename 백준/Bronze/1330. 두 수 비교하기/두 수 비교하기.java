import java.util.*;
class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong();
		if (A==B)
		System.out.println("==");
		else if (A>B)
		System.out.println(">");
		else
		System.out.println("<");
		sc.close();
		System.exit(0);
	}
}