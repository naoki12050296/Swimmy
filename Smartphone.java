package swimmypractice5;


public class Smartphone {


	//OS情報を定義
	public static enum SmartphoneKind{iOS , Android};

	//派生クラスで使用可能な属性を定義
	protected SmartphoneKind Kind;
	protected String Name;
	protected String Cpu;
	protected int Ram;
	protected int Rom;

	//コンストラクタ１
	public Smartphone() {

	}

	//コンストラクタ２
	public Smartphone(SmartphoneKind aKind,String aName) {
		this.Kind = aKind;
		this.Name = aName;
		return;
	}
	//OS情報のgetterメソッド
	public SmartphoneKind getKind() {
		return Kind;
	}
	//OS情報のsetterメソッド
	public void setKind(SmartphoneKind kind) {
		Kind = kind;
		System.out.println("OS"+Kind+"がセットされました");
	}

	//CPU情報のgetterメソッド
	public String getCpu() {
		return Cpu;
	}
	//CPU情報のsetterメソッド
	public void setCpu(String aCpu) {
		this.Cpu = aCpu;
		System.out.println("CPU"+Cpu+"がセットされました");
	}

	//RAM情報のgetterメソッド
	public int getRam() {
		return Ram;
	}
	//RAM情報のsetterメソッド
	public void setRam(int ram) {
		Ram = ram;
		System.out.println("RAM"+Ram+"がセットされました");
	}

	//ROM情報のgetterメソッド
	public int getRom() {
		return Rom;
	}
	//ROM情報のgetterメソッド
	public void setRom(int rom) {
		Rom = rom;
		System.out.println("ROM"+Rom+"がセットされました");
	}

	//音楽DLするメソッド（何もしない）
	public void music() throws CheckException  {
		}


	//音声通話のメソッド（例外チェック込み）
	public void tell(int countrycode,String phonenumber) throws CheckException{
		if(this.Kind == null) {
			throw new NotOsInfoException();
		}
		else if(this.Cpu == null) {
			throw new NotCpuInfoException();
		}
		else if(this.Cpu.isEmpty()) {
			throw new NotCpuInfoException();
		}
		else if(this.Ram == 0) {
			throw new NotRamInfoException();
		}
		else if(this.Rom == 0) {
			throw new NotRomInfoException();
		}

		System.out.println(phonenumber + "の電話を呼び出しています");
		}


	//LINE電話のメソッド（例外チェック込み）
	public void tell(int lineid) throws CheckException{

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

		System.out.println(lineid + "のLINEを呼び出します");
		}



}
