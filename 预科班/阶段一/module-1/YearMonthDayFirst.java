/*
	���ܣ�����������������ж���һ���Ǹ���ĵڼ���
*/

import java.util.Scanner;

public class YearMonthDayFirst {
	
	public static void main (String[] args) {
		// 1. ����������
		System.out.println("Please input year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println("Please input month:");
		sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		System.out.println("Please input day:");
		sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		// 2. ���12���µ�������2������28���ʾ
		int[] DayArr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 3. �ж����꣬�������2�¼�һ��
		if ((year % 4 == 0 && 100 != year %100) || 0 == year % 400) {
			DayArr[1] += 1;
		}
		
		// 4. �����ۼ�
		int count = 0;
		for(int i=0; i<=month - 2; ++i) {
			count += DayArr[i];
		}
		
		count += day;
		System.out.println(year + "��" + month + "��" + day + "���Ǹ���ĵ�" + count + "��.");
		
	}
	
}