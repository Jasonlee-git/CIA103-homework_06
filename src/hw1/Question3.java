package hw1;

public class Question3 {
	//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
    public static void main(String[] arge) {
    	int total = 256559;
        int everyday = 24 * 60 * 60; //每天86400秒
        int everyhour = 60 * 60; //每小時3600秒
        int everyminute = 60; // 每分鐘60秒
        
        int a = total % everyday; // 天數的餘數
        int b = a % everyhour; //小時的餘數
        int c = b % everyminute; //分鐘的餘數 = 秒

        int days = total / everyday; //天數
        int hours = a / everyhour; //小時
        int minutes = b / everyminute; //分鐘

        System.out.println(total + "秒等於 " + days + " 天 " + hours + " 小時 " + minutes + " 分 " + c + " 秒。");
    }
}
