package codeUp100;
/**
 * �ڵ�� ���� 100�� 1011�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
/**
 * �ڵ�� ���� 100�� 1011�� ����
 * @author jikang
 *
 */
public class UseScannerChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner�� �Է¹��� ������ StringŸ�Ը� ���� �� �ֱ� ������
		// charŸ���� ����� �� �����ϴ�.
		// charAt(int index)�޼ҵ�� String���� ����� ���ڿ� �߿���
		// �Ű������� ���޵Ǵ� �ε����� ���� �� ���ڸ� �����Ͽ�
		// charŸ������ ��ȯ��Ű�� �޼ҵ��Դϴ�.
		char c = scanner.next().charAt(0);
		scanner.close();
		System.out.println(c);
	}
}
