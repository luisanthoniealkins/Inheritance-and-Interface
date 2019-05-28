package class_package;

public class BaseCharacter {

	protected String name, description;
	protected boolean canCook = false, canDrive = false, canPaint = false, canWork = false;
	
	
	public void getInfo() {
		
		int count = 0;
		if (canCook)
		{
			System.out.println(name + ", seorang yang bisa memasak");
			count++;
		}
		
		if (canDrive)
		{
			System.out.println(name + ", seorang yang bisa menyetir");
			count++;
		}
		
		if (canWork)
		{
			System.out.println(name + ", seorang yang bisa bekerja");
			count++;
		}
		
		if (canPaint)
		{
			System.out.println(name + ", seorang yang bisa melukis");
			count++;
		}	
		
		if (count == 0)
		{
			System.out.println(name + ", seorang yang tidak bisa melakukan apa-apa");
		}
		
		
	}
	
	
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println("Karakter tidak bisa melakukan aksi");
	}
	
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println("Karakter tidak bisa melakukan aksi");
		
	}

	public String getName()
	{
		return name;
	}
	
}
