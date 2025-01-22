package kadai_018;

abstract public class Kato_Chapter18 {
	// フィールド
	public String familyName; // 姓
	public String givenName;  // 名
	public String address;    // 住所
	
	// メソッド
	// 共通の紹介を出力する
	public void commonIntroduce(String familyName, String givenName, String address) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.address = address;
	}
	
	// 個別の紹介を出力する（抽象メソッド）
	abstract public void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName +"です" );	
		System.out.println("住所は" + this.address + "です");
	}
}
