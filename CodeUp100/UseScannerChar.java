package codeUp100;
/**
 * 코드업 기초 100제 1011번 문제
 * @author jikang
 *
 */
import java.util.Scanner;
/**
 * 코드업 기초 100제 1011번 문제
 * @author jikang
 *
 */
public class UseScannerChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner로 입력받을 때에는 String타입만 받을 수 있기 때문에
		// char타입을 사용할 수 없습니다.
		// charAt(int index)메소드는 String으로 저장된 문자열 중에서
		// 매개변수로 전달되는 인덱스에 대한 한 글자만 선택하여
		// char타입으로 변환시키는 메소드입니다.
		char c = scanner.next().charAt(0);
		scanner.close();
		System.out.println(c);
	}
}
