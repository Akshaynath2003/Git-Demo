
public class Ps3 {
	
	int a;//class variable
	public Ps3(int a) {//instance variable
		this.a=a; //it gets the value from the test page and initialised globally 
		//so it can accessed to others
	}

	public int  multiplication() {
		a=a*a;
		return a;
	}
}

