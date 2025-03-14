package hw2;

//請建立可以輸出九九乘法表
//使用for+while迴圈
//使用for+do while迴圈
//使用while+do while迴圈
public class Hw2_0312_1 {
	public static void main(String[] args) {
		////使用for+while迴圈
//		int i , j;
//		for(i = 1 ; i <= 9 ; i++) {
//			for(j = 1 ; j <= 9 ; j++) {
//				System.out.print(i + "*" + j+"=" + i * j + "\t");
//			}
//		System.out.println();
//		}

        //使用for+do while迴圈
//		 int i = 1; 
//
//	        while (i <= 9) { 
//	            int j = 1; 
//	            
//	            do { 
//	                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
//	                j++; 
//	            } while (j <= 9); 
//
//	            System.out.println(); 
//	            i++;}
		//使用while+do while迴圈
		int i = 1; 

        while (i <= 9) { 
            int j = 1; 

            do {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
                j++;
            } while (j <= 9); 

            System.out.println(); 
            i++; 
        }
    }
}
