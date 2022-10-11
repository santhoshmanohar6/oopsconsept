package abstractexamples;

public class newex extends example{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
		{
			System.out.println("new");
		}
	}

	@Override
	public void dob() {
		// TODO Auto-generated method stub
		{
			System.out.println("verty");
		}
	}

	@Override
	public void phonenumber() {
		// TODO Auto-generated method stub
		{
			System.out.println("bad");
		}
	}
	public static void main(String[] args) {
		newex gh= new newex();
		gh.name();
		gh.dob();
		gh.phonenumber();
		gh.fathersname();
	}

}
