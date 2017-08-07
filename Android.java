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
		System.out.println("Google Play Musicでダウンロードしました");
	}


	}
