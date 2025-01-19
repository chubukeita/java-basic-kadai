package kadai_015;


//車クラス
public class Car_Chapter15 {
	// フィールド（内部データ）
	private int gear  = 0 ; // 1速から5速のギアを表す
	private int speed = 0; // ギアチェンジ後の速度を表す
	
	// コンストラクタ（初期化処理）
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// 【メソッドgearChange】ギアの値により速度を変える
	// afterGear：ギア数
	public void gearChange( final int afterGear ) {
		switch(afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
		}
	}
	
	// 【メソッドrun】ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("時速" + this.speed + "km");
	}
	
}
