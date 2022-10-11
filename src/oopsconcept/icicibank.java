package oopsconcept;

public class icicibank extends hdfcbank {
	public void insurenceaccount()
	{
		System.out.println("insurance account");
	
	}
	public static void main(String[] args) {
		icicibank test= new icicibank();
		test.savingaccount();
		test.insurenceaccount();
		test.currentaccount();
	}

}
