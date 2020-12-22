/*
	功能：
*/
import java.util.Random;

public class RedandBlueThird {
	
	public static void main (String[] args) {
		
		int[] red = new int[6];
		int blue = new Random(16);
		blue += 1;
		
		for(int=0; i<6; ++i) {
			
			red[] = new Random(36);
			red[i] += 1;
			for(int j=0; j<i; ++i) {
				if (red[i] == red[j]) {
					--i;
					break;
				}
			}
		}
		
		System.out.print("蓝色球球号为:" + blue);
		for(int i=0; i<6; ++i) {
			System.out.print("红色球球号分别为:" + red[i] + " ");
		}
		System.out.println();
	}
}