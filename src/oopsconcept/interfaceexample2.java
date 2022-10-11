package oopsconcept;

public class interfaceexample2 implements interfaceexamples {

	@Override
	public void customerregistration() {
		// TODO Auto-generated method stub
		
		{
		System.out.println("customer registration");
		}
	}

	@Override
	public void customerdelete() {
		// TODO Auto-generated method stub
		{
			System.out.println("customer delete");
		}
	}

	@Override
	public void customeredit() {
		// TODO Auto-generated method stub
		{
			System.out.println("customer edit");
		}
		
	}
	public static void main(String[] args) {
		interfaceexample2 pm= new interfaceexample2();
		pm.customerregistration();
		pm.customerdelete();
		pm.customeredit();
	}

	@Override
	public void customermodify() {
		// TODO Auto-generated method stub
		{
			System.out.println("customer");
		}
		
	}

}
