package codeUp100;
/**
 * �ڵ�� ���� 100�� 1013�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
public class UseScannerTwoInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.printf("%d %d", a, b);
		scanner.close();
	}
}
