package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int Val) {
		this.iValue=Val;
	}
	
	public int getiValue() {
		return iValue;
	}
	public boolean isEven() {
		if (getiValue() % 2 ==0){
			return true;
		}
		return false;
	}
	public boolean isOdd() {
		if (getiValue() % 2 != 0) {
			return true;
		}
		return false;
	}
	public boolean isPrime() {
		for (int i = 2; i < getiValue(); i++){
			if (getiValue() % i == 0)
				return false;
		}
		return true;
	}
	static boolean isEven(int Even) {
		if (Even % 2 == 0) {
			return true;
		}
		return false;
	}
	static boolean isOdd(int Odd) {
		if (Odd % 2 != 0) {
			return true;
		}
		return false;
	}
	static boolean isPrime(int Prime) {
		for (int i = 2; i < Prime; i++) {
			if(Prime % i == 0)
				return false;
		}
		return true;
	}
	static boolean isEven(MyInteger x) {
		if (x.isEven()) {
			return true;
		}
		return false;
	}
	static boolean isOdd(MyInteger y) {
		if (y.isOdd()) {
			return true;
		}
		return false;
	}
	static boolean isPrime(MyInteger z) {
		if (z.isPrime()) {
			return true;
		}
		return false;
	}
	public boolean equals(int t) {
		if(t == iValue) {
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger Val) {
		return (Val.getiValue()== iValue);
	}
}
