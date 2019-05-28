package class_package;

import interface_package.IDriver;

public class Driver extends BaseCharacter implements IDriver {

	public Driver() {
		// TODO Auto-generated constructor stub
		name = "Driver";
		canDrive = true;
	}
	
	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " menyetir");
	}

}
