package hw1;
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class hw6 {
	public static void main(String[]args) {
		int num = 5;
		System.out.println(num + num); // 兩者相加的值
		System.out.println(num + '5'); //單引號內代表字元,而'5'數值為53,再與5合併計算而成
		System.out.println(num + "5"); //雙引號內代表字串,故是與5串接連而成
		
	}
	
	
}
