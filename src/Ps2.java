
public class Ps2 extends Ps3 {
	int a;//class variable 
	public Ps2(int a) {//instance class
		super(a);
		this.a =a ;//it gets the value from the test page and initialised globally 
		//so it can accessed to others
		// TODO Auto-generated constructor stub
	}

	

	public int  increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}
}
