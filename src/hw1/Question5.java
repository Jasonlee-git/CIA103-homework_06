package hw1;

public class Question5 {
	//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	//金加利息共有多少錢(用複利計算，
	//公式S = P(I + i)n，其中以符號I代表利息，P代表本金，n代表期數，i代表利率，S代表本利和。)
    public static void main(String[] arge) {
    	double principal = 1500000; // 本金
        double annualRate = 0.02; // 年利率 2%
        int years = 10; // 計算年數
        int timesCompounded = 1; // 每年複利計算次數

        // 計算複利
        double amount = principal * Math.pow(1 + annualRate / timesCompounded, timesCompounded * years);

        // 輸出結果
        System.out.printf("10年後，本金加利息的總額為: %.2f元%n", amount);
//    	double p = 1500000; //本金
//    	double i = 0.02;    //利率2%
//    	double years = 10;  //年數
//    	double I = 
//    	double S = 
    	
    }
}
