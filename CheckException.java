package swimmypractice5;

public class CheckException extends Exception{
	public CheckException(String str) {
		super(str);
	}

}

class NotOsInfoException extends CheckException{
	public NotOsInfoException() {
		super("入力されたOS情報に誤りがあります");
	}

class NotCpuInfoException extends CheckException{
	public NotCpuInfoException() {
		super("入力されたCPU情報に誤りがあります");
	}

class NotRamInfoException extends CheckException{
	public NotRamInfoException() {
		super("入力されたOS情報に誤りがあります");
	}

class NotRomInfoException extends CheckException{
	public NotRomInfoException() {
		super("入力されたOS情報に誤りがあります");
	}
/*
	//各情報の未定義チェック
	public void less() throws Exception{
		try {

		SmartphoneKind Kind = null;
		String Cpu = null;
		int Ram = 0;
		int Rom = 0;

		if(Kind == null){
			System.out.println("OS情報が不正です");
			throw new Check();
			}
		else if(Cpu == null) {
			System.out.println("CPU情報が不正です");
			throw new Check();
		}
		else if(Cpu.isEmpty()) {
			System.out.println("CPU情報が不正です");
			throw new Check();
		}
		else if(Ram == 0) {
			System.out.println("RAM情報が不正です");
			throw new Check();
		}
		else if(Rom == 0) {
			System.out.println("ROM情報が不正です");
			throw new Check();
		}
		}
		catch(Exception e) {
			super(e);
		}*/
	}

}
}
}

