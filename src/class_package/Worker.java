package class_package;

import interface_package.IWorker;

public class Worker extends BaseCharacter implements IWorker{

	public Worker() {
		// TODO Auto-generated constructor stub
		name = "Worker";
		canWork = true;
	}
	
	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " bekerja");
	}

}
