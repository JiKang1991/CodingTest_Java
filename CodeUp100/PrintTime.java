package codeUp100;
/**
 * �ڵ�� ���� 100�� 1018�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class PrintTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.next();
		StringTokenizer st = new StringTokenizer(time, ":");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + ":" + st.nextToken());
		}
		scanner.close();
	}
}
