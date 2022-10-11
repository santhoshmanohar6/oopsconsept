
public class methodoverloading {

	public void add()
	{
		int i=10;
		int j=12;
		int k=i+j;
		System.out.println(k);
	}
	public void add(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
	}
	public void add(int i,int j,int k)
	{
		k=i-j;
		System.out.println(k);
	}
	public static void main(String[] args) {
		
		 methodoverloading bb= new  methodoverloading();
		   int i=10 ,j=20,k=0;
		 bb.add();
		 bb.add(i, j);
		 bb.add(i, j, k);
		
	}
	

}
