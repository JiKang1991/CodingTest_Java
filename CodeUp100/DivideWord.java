package codeUp100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * �ڵ�� ���� 100�� 1024�� ����
 * @author jikang
 *
 */
public class DivideWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		for(int i = 0; i < input.length; i++) {
			System.out.println("'"+input[i]+"'");
		}
	}
}
