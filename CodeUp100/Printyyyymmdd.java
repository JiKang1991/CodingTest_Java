package codeUp100;
/**
 * �ڵ�� ���� 100�� 1019�� ����
 * @author jikang
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class Printyyyymmdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String date = scanner.next();
		StringTokenizer st = new StringTokenizer(date, ".");
		if(st.hasMoreTokens()) {
			System.out.printf("%04d.%02d.%02d", Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		scanner.close();
	}
}
