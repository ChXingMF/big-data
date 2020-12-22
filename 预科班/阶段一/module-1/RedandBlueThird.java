/*
	功能：双色球，六个1-33之间不重复的红色球，一个1-16之间的蓝色球
*/
import java.util.Random;

public class RedandBlueThird {
	
	public static void main (String[] args) {
		
		int[] red = new int[6];
		int blue = new Random().nextInt(16);
		blue += 1;
		Random random = new Random();
		
		for(int i=0; i<6; ++i) {
			
			red[i] = random.nextInt(33);
			red[i] += 1;
			
			if (i > 1){
				for(int j=0; j<i; ++j) {
					if (red[i] == red[j]) {
						--i;
						break;
					}
				}
			}
		}
		
		System.out.println("蓝色球球号为:" + blue);
		System.out.print("红色球球号分别为:");
		for(int i=0; i<6; ++i) {
			System.out.print(red[i] + " ");
		}
		System.out.println();
	}
}