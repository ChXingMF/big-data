/*
	功能：打印五子棋盘
*/

public class  BoardFifth{
	
	public static void main(String[] args) {
		
		for(int i=0; i<17; ++i) {
			if (0 == i){
				System.out.print("  ");
			}
			else{
				System.out.print(Integer.toHexString(i - 1) + " ");
			}
		}
		System.out.println();
		
		for(int i=0; i<16; ++i) {
			System.out.print(Integer.toHexString(i) + " ");
			for (int j=0; j<16; ++j) {
				System.out.print("+ ");
			}
			System.out.println();
		}
	}
}