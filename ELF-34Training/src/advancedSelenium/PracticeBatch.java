package advancedSelenium;

import org.testng.annotations.Test;

public class PracticeBatch {
	
	@Test(dependsOnMethods = "food",groups = "smoke")
	public void sports() {
		System.out.println("Cricket");
		System.out.println("Tennis");
		System.out.println("FootBall");
	}
	
	@Test(enabled = false)
	public void food() {
		System.out.println("Chicken Biriyani");
		System.out.println("Tale maamsa");
		System.out.println("Haleem");
		//int i=1/0;
	}
	
	@Test (groups = "regression")
	public void movies() {
		System.out.println("Charlie");
		System.out.println("KGF-2");
		System.out.println("Vikranth Rona");
	}
	
	@Test(groups = "smoke")
	public void subjects() {
		System.out.println("Physics");
		System.out.println("Chemistry");
		System.out.println("Maths");
	}

}
