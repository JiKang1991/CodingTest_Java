package codeUp100;
/**
 * 코드업 기초 100제 1012번 문제
 * @author jikang
 *
 */
import java.util.Scanner;
public class UseScannerFloat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float f = scanner.nextFloat();
		System.out.printf("%f", f);
		scanner.close();
	}
}
