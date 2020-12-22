/*
	功能：当数据达到数组的80%时，数组扩容1.5倍
*/

import java.util.Scanner;
import java.util.Arrays;

public class ArrayCapacityFourth{

	public static void main (String[] args) {
		System.out.print("请输入初始容量:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int count = 0;
		int i = 0;
		for(;;){
			System.out.println("请输入第" + (i + 1) + "的值:");
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
				// 调试打印语句
				//System.out.println("brr length is " + brr.length + "num is " + num);
				arr = brr;
				System.out.println("目前数组中的所有值及数组长度:" + Arrays.toString(arr) + " " + arr.length);
			}
		}
	}
}