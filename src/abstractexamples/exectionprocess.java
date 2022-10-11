package abstractexamples;

public class exectionprocess extends example{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		{
			int l=8;
			System.out.println("please enter your name"+l);
		}
		
	}

	@Override
	public void dob() {
		// TODO Auto-generated method stub
		{
			System.out.println("please enter your dop");
		}
		
	}

	@Override
	public void phonenumber() {
		// TODO Auto-generated method stub
		{
			System.out.println("please enter your phone number");
		}
		
	}
	public static void main(String[] args) {
		exectionprocess mc= new exectionprocess();
		mc.name();
		mc.dob();
		mc.phonenumber();
	
	}
}
