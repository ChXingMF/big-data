/*
	���ܣ�˫ɫ������1-33֮�䲻�ظ��ĺ�ɫ��һ��1-16֮�����ɫ��
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
		
		System.out.println("��ɫ�����Ϊ:" + blue);
		System.out.print("��ɫ����ŷֱ�Ϊ:");
		for(int i=0; i<6; ++i) {
			System.out.print(red[i] + " ");
		}
		System.out.println();
	}
}