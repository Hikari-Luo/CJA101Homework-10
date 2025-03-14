package hw1;

//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class hw4 {
	public static void main(String[]args) {
		final double PI = 3.1415 ;
		int radius = 5 ;
		System.out.println("圓面積為"+radius * radius * PI);
		System.out.println("圓周長為"+radius * 2 * PI);
	}
}
