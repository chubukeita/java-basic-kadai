package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//　名を表すフィールドの値をセットする
	public void setGivenName() {
		super.givenName = "太郎";
		super.commonIntroduce();
	}
	
	// eachIntroduceの実装
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
