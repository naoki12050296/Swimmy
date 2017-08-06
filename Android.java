package swimmypractice5;

public class Android extends Smartphone{

	//コンストラクタ１
	public Android() {
	}


	//コンストラクタ２
	public Android(String aName) {
		super(SmartphoneKind.Android,aName);
	}

	//音楽DLメソッド（例外チェック込み）
	public void music() throws CheckException{

		System.out.println("Google Play Musicでダウンロードしました");
	}


	}
