package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	// 名を表すフィールドの値をセットする
	public void setGivenName() {
		super.familyName = "加藤";
		super.givenName = "花子";
		super.commonIntroduce();
	}
	
	// eachIntroduceの実装
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
	
}
