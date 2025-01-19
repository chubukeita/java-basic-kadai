package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		//車クラスのインスタンスを作成
		Car_Chapter15 mycar = new Car_Chapter15(1, 10);
		
		// 車クラスのgearChangeメソッドを実行
		mycar.gearChange(3);
		
		// 車クラスのrunメソッドを実行
		mycar.run();
				
	}
}
