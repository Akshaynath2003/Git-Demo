import org.testng.annotations.Test;

public class Ps1 extends Method1{

	@Test
	public void getAll() {
		Ps2 ps2=new Ps2(3);
		int a=3;
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplication());
		System.out.println("all have done");
		System.out.println("we can also it wright");
	}
	
	
}
