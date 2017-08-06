package swimmypractice5;

public class Iphone extends Smartphone{

	//コンストラクタ１
	public Iphone() {
	}

	//コンストラクタ２
	public Iphone(String aName) {
		super(SmartphoneKind.iOS,aName);
	}

	//音楽DLメソッド（例外チェック込み）
	public void music() throws CheckException {
		System.out.println("Itunesでダウンロードしました");
	}
}
