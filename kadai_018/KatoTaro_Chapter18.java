package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//　名を表すフィールドの値をセットする
	public void setGivenName() {
		super.familyName = "加藤";
		super.givenName = "太郎";
		super.address = "東京都中野区〇×";
	}
	
	// eachIntroduceの実装
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
