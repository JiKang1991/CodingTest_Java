package codeUp100;
/**
 * �ڵ�� ���� 100�� 1014�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
public class PrintChangeSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char x = scanner.next().charAt(0);
		char y = scanner.next().charAt(0);
		System.out.println(y+" "+x);
		scanner.close();
	}
}
