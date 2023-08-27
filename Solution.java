import java.util.Scanner;

//change class to 'Main'
public class Main {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int pa = fs.nextInt(), pb = fs.nextInt(), pc = fs.nextInt();
			System.out.println(Math.max(pa + pc, pb));
		}
		fs.close();
	}
}
