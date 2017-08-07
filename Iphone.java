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
		if(Kind == null) {
			throw new NotOsInfoException();
		}
		else if(Cpu == null) {
			throw new NotCpuInfoException();
		}
		else if(Cpu.isEmpty()) {
			throw new NotCpuInfoException();
		}
		else if(Ram == 0) {
			throw new NotRamInfoException();
		}
		else if(Rom == 0) {
			throw new NotRomInfoException();
		}
		System.out.println("Itunesでダウンロードしました");
	}
}
