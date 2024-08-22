package hw1;

public class Question6 {
//	請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
    public static void main(String[] arge) {
    	
    	System.out.println(5 + 5);
    	// 5 + 5 都是整數，直接相加 結果是10
    	System.out.println(5 + '5');
    	// '5' 是一個字符，字符 '5' 的 ASCII 值是 53。
        // 當數字與字符一起運算時，字符會被轉換為其 ASCII 值，
        // 因此運算會變成 5 + 53，結果是 58。
    	System.out.println(5 + "5");
    	// "5"是字元，(5 + "5") 整數5 和 "5" 串接 結果是55
    	
    	
    }
	    
}
