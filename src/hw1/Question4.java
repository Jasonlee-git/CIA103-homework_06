package hw1;

public class Question4 {
	//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	public static void main(String[]arge) {
		double pi = 3.1415;
		double half = 5;
		double area = (half * half) * pi;
		double perimeter = ((half * 2) * pi );
		
		System.out.printf("圓面積 = %.2f%n" , area);
		
		System.out.printf("圓周長 = %.2f%n" , perimeter);
		
	}
	

}
