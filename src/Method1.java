import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Method1 {
	
	@AfterTest
	public void sendAll() {
		System.out.println("It closes");
	}
	
	@BeforeTest
	public void before() {
		System.out.println("It Opens");
	}
}
