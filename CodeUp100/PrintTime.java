package codeUp100;
/**
 * 코드업 기초 100제 1018번 문제
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
