/*
	���ܣ������ݴﵽ�����80%ʱ����������1.5��
*/

import java.util.Scanner;
import java.util.Arrays;

public class ArrayCapacityFourth{

	public static void main (String[] args) {
		System.out.print("�������ʼ����:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int count = 0;
		int i = 0;
		for(;;){
			System.out.println("�������" + (i + 1) + "��ֵ:");
			sc = new Scanner(System.in);
			
			arr[i] = sc.nextInt();
			++count;
			
			if (-1 == arr[i]){
				System.out.println("Game over!");
				break;
			}
			++i;
			if (((1.0*count)/arr.length) >= 0.8){
				num = arr.length + (arr.length >> 1);
				int[] brr = new int[num];
				System.arraycopy(arr, 0, brr, 0, count);
				// ���Դ�ӡ���
				//System.out.println("brr length is " + brr.length + "num is " + num);
				arr = brr;
				System.out.println("Ŀǰ�����е�����ֵ�����鳤��:" + Arrays.toString(arr) + " " + arr.length);
			}
		}
	}
}