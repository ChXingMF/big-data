/*
	���ܣ����1000���ڵ�����
*/

import java.util.Scanner;

public class PerfectNumSecond {
	
	
	public static void main (String[] args) {
		System.out.print("1000������Ϊ: 1");
		// 1. 1~1000
		int count = 0;
		for(int num=2; num<=1000; ++num) {
			for(int i=1; i<=num-1; ++i) {
				if ((num % i) == 0) {
					count += i;
				}
			}
			
			if (num == count) {
				System.out.print(" " + num);
			}
			
			count = 0;

		}
		System.out.println();

	}
	
}