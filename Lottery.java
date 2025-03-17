package hw3;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("請輸入你不喜歡的數字 (1~9): ");
        int dislikedNumber = scanner.nextInt();
        
        
        if (dislikedNumber < 1 || dislikedNumber > 9) {
            System.out.println("輸入錯誤！請輸入 1~9 之間的數字");
        } 
        else 
        {
            System.out.println("阿文可以選擇的號碼:");
            int count = 0;

           
            for (int i = 1; i <= 49; i++) {
                if (!containsDigit(i, dislikedNumber)) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            
          
            System.out.println("\n總共有 " + count + " 個號碼可以選擇。");
        }
        
        scanner.close();
    }

    
    public static boolean containsDigit(int number, int dislikedNumber) {
        while (number > 0) {
            if (number % 10 == dislikedNumber) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
