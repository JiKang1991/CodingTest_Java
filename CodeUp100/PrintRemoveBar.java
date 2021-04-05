package codeUp100;
/**
 * 코드업 기초 100제 1020번 문제
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
