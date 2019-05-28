package class_package;

import interface_package.IChef;

public class Chef extends BaseCharacter implements IChef {

	public Chef() {
		// TODO Auto-generated constructor stub
		name = "Chef";
		canCook = true;		
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name + " memasak");
	}

}
