package class_package;

import interface_package.IArtist;
import interface_package.IDriver;

public class Painter extends BaseCharacter implements IArtist,IDriver{

	public Painter() {
		// TODO Auto-generated constructor stub
		name = "Painter";
		canPaint = true;
		canDrive = true;				
	}
	
	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " menyetir");
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name + " melukis");
	}

}
