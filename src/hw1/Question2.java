package hw1;

public class Question2 {
	//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	public static void main(String[] arge) {
//		System.out.println((200 / 12) + "打");
//		System.out.println((200 % 12) + "顆");
		
		int eggs = 200;
		int dozen = 12;
		int dozens = eggs / dozen;
		int remainder = eggs % dozen;
		
		System.out.print(dozens + " 打 ");
		
		System.out.print(remainder + " 顆 ");
		
	}

}
