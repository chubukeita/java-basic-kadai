package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// 辞書として機能するHashMapを宣言
	private HashMap<String,String> dicMap = new HashMap<String,String>();
	
    // コンストラクタで辞書を初期化
    public Dictionary_Chapter21() {
        addDic();
    }
	
	public void addDic() {
		dicMap.put("apple", "りんご");
		dicMap.put("peach", "桃");
		dicMap.put("banana", "バナナ");
		dicMap.put("lemon", "レモン");
		dicMap.put("pear", "梨");
		dicMap.put("kiwi", "キウィ");
		dicMap.put("strawberry", "いちご");
		dicMap.put("grape", "ぶどう");
		dicMap.put("muscat", "マスカット");
		dicMap.put("cherry", "さくらんぼ");
	}
		
	// 【メソッドsearch】辞書を調べる
	// word：検索用語
	// wordsArray：検索用語一覧
	
	// 辞書を調べて、辞書に追加されている場合、辞書で調べて結果を出力する
	// 例：appleの意味はりんご
	// 辞書に追加されていない場合、 辞書に追加されていない旨を出力する
	// 例：orangeは辞書に存在しません
	
	public void search( String[] wordsArray ) {
		for( String word : wordsArray ) {			
			if( dicMap.containsKey(word) ) {
				System.out.println( word + "の意味は"+ dicMap.get(word));
			} else {
				System.out.println( word + "は辞書に存在しません");
			}
		}
	}
}

	
	

	
	