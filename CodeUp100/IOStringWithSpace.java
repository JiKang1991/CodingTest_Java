package codeUp100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ڵ�� ���� 100�� 1022�� ����
 * @author jikang
 *
 */
public class IOStringWithSpace {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char[] data = br.readLine().toCharArray();
		System.out.print(data);
		
	}
}
