package codeUp100;
/**
 * �ڵ�� ���� 100�� 1017�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
public class PrintIntThreeTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.print(i+" "+i+" "+i);
		scanner.close();
	}
}
