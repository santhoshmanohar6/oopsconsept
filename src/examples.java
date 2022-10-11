
public class examples {
	
	public  int add(int i,int j) 
	{
		return i+j;
	}

	public static int add(int i,int j,int k)
	{
		return i+j+k;           
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		examples nm=new examples();

		System.out.println(nm.add(2, 3));
		System.out.println(examples.add(1, 2, 3));
	}

}
