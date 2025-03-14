package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class hw3 {
	public static void main(String[]args) {
		int seconds = 256559 ;
		int day = seconds / 86400 ;
		int hours = (seconds % 86400) / 3600;
		int min = (seconds % 3600) / 60;
		int second = seconds % 60 ;
		System.out.println(day+"天"+hours+"小時"+min+"分"+second+"秒");
		
	}


}
