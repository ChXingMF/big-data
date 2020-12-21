/*
	功能：根据输入的年月日判断这一天是该年的第几天
*/

import java.util.Scanner;

public class YearMonthDayFirst {
	
	public static void main (String[] args) {
		// 1. 输入年月日
		System.out.println("Please input year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println("Please input month:");
		sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		System.out.println("Please input day:");
		sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		// 2. 存放12个月的天数，2月暂用28天表示
		int[] DayArr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 3. 判断闰年，如果是则2月加一天
		if ((year % 4 == 0 && 100 != year %100) || 0 == year % 400) {
			DayArr[1] += 1;
		}
		
		// 4. 天数累加
		int count = 0;
		for(int i=0; i<=month - 2; ++i) {
			count += DayArr[i];
		}
		
		count += day;
		System.out.println(year + "年" + month + "月" + day + "号是该年的第" + count + "天.");
		
	}
	
}