package codeUp100;
/**
 * �ڵ�� ���� 100�� 1020�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
public class PrintRemoveBar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] num = scanner.next().split("-");
		System.out.println(num[0]+num[1]);
		scanner.close();
	}
}
