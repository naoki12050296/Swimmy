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
	public void music() throws Exception {
		Check check = new Check();
		check.less1(getKind());
		check.less2(getCpu());
		check.less3(getRam());
		check.less4(getRom());

		System.out.println("Itunesでダウンロードしました");
	}
}
