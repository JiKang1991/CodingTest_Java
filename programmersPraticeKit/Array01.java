package programmersPracticeKit;

/*
 * ���� ����
 * �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
 *
 * ���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
 *
 * array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
 * 1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
 * 2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
 * �迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * ���ѻ���
 * array�� ���̴� 1 �̻� 100 �����Դϴ�.
 * array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
 * commands�� ���̴� 1 �̻� 50 �����Դϴ�.
 * commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
 * ����� ��
 * array					commands							return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 * 
 * ����� �� ����
 * [1, 5, 2, 6, 3, 7, 4]�� 2��°���� 5��°���� �ڸ� �� �����մϴ�. [2, 3, 5, 6]�� �� ��° ���ڴ� 5�Դϴ�.
 * [1, 5, 2, 6, 3, 7, 4]�� 4��°���� 4��°���� �ڸ� �� �����մϴ�. [6]�� ù ��° ���ڴ� 6�Դϴ�.
 * [1, 5, 2, 6, 3, 7, 4]�� 1��°���� 7��°���� �ڸ��ϴ�. [1, 2, 3, 4, 5, 6, 7]�� �� ��° ���ڴ� 3�Դϴ�.
 */

public class Array01 {
	public static void main(String[] args) {
		
		
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		int start, end, pick;
		
		for(int i = 0; i < commands.length; i++) {
			
			start = commands[i][0] - 1;
			end = commands[i][1] - 1;
			pick = commands[i][2] - 1;
			
			if(end - start + 1 == 1) {
				answer[i] = array[start];
				continue;
			}
			
			int[] splitedArr = new int[end - start + 1];
			int index = 0;
			for(int j = start; j <= end; j++) {
				splitedArr[index++] = array[j];
			}
			
			sort(splitedArr, 0, index - 1);
			
			answer[i] = splitedArr[pick];
		}
		System.out.println(answer[0]+" "+answer[1]+" "+answer[2]);
	}
	
	public static void sort(int[] splitedArr, int left, int right) {
		
		int leftIndex = left;
		int rightIndex = right;
		int centerValue = splitedArr[(leftIndex + rightIndex)/2];
		
		do {
		while(splitedArr[leftIndex] < centerValue) leftIndex++;
		while(splitedArr[rightIndex] > centerValue) rightIndex--;
		if(leftIndex <= rightIndex) {
			int temp = splitedArr[leftIndex];
			splitedArr[leftIndex] = splitedArr[rightIndex];
			splitedArr[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
		}
		} while(leftIndex <= rightIndex);
		
		if(left < rightIndex) sort(splitedArr, left, rightIndex);
		if(right > leftIndex) sort(splitedArr, leftIndex, right);	
		
		
	}
}
