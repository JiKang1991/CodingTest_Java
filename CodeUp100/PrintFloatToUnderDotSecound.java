package codeUp100;
/**
 * 코드업 기초 100제 1015번 문제
 * @author jikang
 *
 */
import java.util.Scanner;
public class PrintFloatToUnderDotSecound {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float f = scanner.nextFloat();
		System.out.printf("%.2f", f);
		scanner.close();
	}
}
