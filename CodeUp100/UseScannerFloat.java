package codeUp100;
/**
 * �ڵ�� ���� 100�� 1012�� ����
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
