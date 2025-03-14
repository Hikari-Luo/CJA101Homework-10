package hw2;

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

public class Hw2_0312_2 {
	public static void main(String[] args) {
//		int sum = 1 ;
//		for (int i = 1; i <= 10;i++) {
//			sum *=  i ;
//		}
//		System.out.println(sum);
		
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//		int num = 1; 
//        int sum = 1; 
//
//        while (num <= 10) { 
//            sum *= num;
//            num++;
//        }
//
//        System.out.println(sum);
    
	

//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
		int num = 1; 

		while (num <= 10) { 
				System.out.print(num * num + " "); 
				num++;
}
	}
}