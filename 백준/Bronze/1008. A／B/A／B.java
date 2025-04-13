import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextInt(), b = sc.nextInt();
		System.out.printf("%.9f", a/b);
		sc.close();	
	}
}