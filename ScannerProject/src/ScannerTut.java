import java.util.Scanner;

public class ScannerTut {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("what is your name");
		String name = scan.next();
		System.out.println("what is your age");
		byte age=scan.nextByte();
		System.out.println("what are you doing");
		String doing=scan.next();
		System.out.println("What is your salary");
		float salary=scan.nextFloat();
		System.out.println("whta is your id");
		int id=scan.nextInt();
		
		
		


	}

}
