package hw1;

//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class hw2 {
	public static void main(String[]args) {
		int eggs = 200 ;
		int boxes = 200/12 ;
		int another = 200 % 12 ;
		System.out.println(boxes + "打" + another + "顆");
	}


}
