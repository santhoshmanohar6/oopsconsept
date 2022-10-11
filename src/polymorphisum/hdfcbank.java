package polymorphisum;

public class hdfcbank extends overridingmethod  {
	
	int rateofintrest()
	{
		return 9;
	}
	public static void main(String[] args) {
		hdfcbank sd= new hdfcbank();
			int k=sd.rateofintrest();
			System.out.println(k);
	}

}
