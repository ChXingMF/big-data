/*
	功能：输出1000以内的完数
*/

import java.util.Scanner;

public class PerfectNumSecond {
	
	
	public static void main (String[] args) {
		System.out.print("1000内完数为: 1");
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