package class_package;

import interface_package.IArtist;
import interface_package.IChef;
import interface_package.IDriver;
import interface_package.IWorker;

public class Assistant extends BaseCharacter implements IChef, IArtist, IDriver, IWorker{

	public Assistant() {		
		name = "Assistant";
		canCook = true;
		canWork = true;
		canPaint = true;
		canDrive = true;
	}		
	
	
	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " bekerja");
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

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name + " memasak");
		
	}


}
