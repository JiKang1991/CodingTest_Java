package codeUp100;
/**
 * 코드업 기초 100제 1017번 문제
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
