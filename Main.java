package swimmypractice5;

public class Main {

	public static void main(String[] args) throws Exception {


	try {

		//Iphoneのインスタンスを生成
		Smartphone Iphone7 = new Iphone("NaokiPhone");

		//LINE電話メソッドを呼び出し（例外処理発生）
		//Iphone7.tell(6255);

		//CPUをセットするメソッドを呼び出し
		Iphone7.setCpu("intel");

		//CPUをセットするメソッドを呼び出し（例外処理発生）
		//Iphone7.setCpu(null);

		//RAMをセット
		Iphone7.setRam(4);

		//ROMをセット
		Iphone7.setRom(128);

		//OS情報初期化(例外処理発生)
		Iphone7.setKind(null);

		//音楽DLメソッドをオーバーライド
		Iphone7.music();

		//LINE電話メソッドを呼び出し
		Iphone7.tell(6255);



		//Androidインスタンスを生成
		Smartphone Galaxy = new Android("Android");

		//CPU情報をセット
		Galaxy.setCpu("intel");

		//RAMをセット
		Galaxy.setRam(8);

		//ROMをセット
		Galaxy.setRom(250);

		//音楽DLメソッドをオーバーライド
		Galaxy.music();

		//音声通話メソッドを呼び出し
		Galaxy.tell(80, "090-1234-5678");

	}

	catch (CheckException e) {
		e.printStackTrace();
	}

	}


}
