package hw2;

public class Question1 {
	public static void main(String[] args) {
//	• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
				int j = 0;
				for (int i = 2; i <= 1000 && i % 2 ==0 ; i += 2) {
					j += i;
				}
				System.out.println("偶數和為" + j);
				
//	• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
				int a = 1;
				for (int b = 1; b <= 10; b++) {
					a *= b;
				}
				System.out.println("連乘積為" + a);
				
//	• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
				int c = 1;
				int d = 1;
				while (d <= 10) {
					c *= d;
					d++;			
				}
				System.out.println("連乘積為" + c);
				
//	• 請設計一隻Java程式，輸出結果為以下：//	1 4 9 16 25 36 49 64 81 100
				int e = 1;
				int f = 0;
				while (e <= 10) {
					f = (int)Math.pow(e,2);
					System.out.print(f + " ");
					e++;
				}
				
				System.out.println();
    }
}
