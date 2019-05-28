package main;

import java.util.ArrayList;
import java.util.Scanner;

import class_package.Assistant;
import class_package.BaseCharacter;
import class_package.Chef;
import class_package.Driver;
import class_package.Fisher;
import class_package.Painter;
import class_package.Worker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ArrayList<BaseCharacter> characters = new ArrayList<>();
	
		BaseCharacter character = new Assistant();
		characters.add(character);
		
		character = new Chef();
		characters.add(character);
		
		character = new Driver();
		characters.add(character);
		
		character = new Fisher();
		characters.add(character);
		
		character = new Painter();
		characters.add(character);
		
		character = new Worker();
		characters.add(character);
		
		while(true)
		{			
			for (int i = 0; i < 10; i++) System.out.println();
			
			System.out.println("Simulasi kelompok kemampuan");
			for (int i = 0 ; i < characters.size(); i++)
			{
				System.out.println(i + ":" + characters.get(i).getName());
			}
			System.out.println(6 + ":Exit");
			
			
			System.out.print("Input : ");
			
			String action = sc.next();
			String target = sc.nextLine();		
					
			ArrayList<Integer> targets = new ArrayList<>();
			for (int i = 1; i < target.length(); i+=2)
			{				
				int idx = (int)(target.charAt(i)-'0');
				
				if (idx >= 0 && idx <= 5) {
					targets.add(idx);
				}
				else {
					System.out.println("index (" + idx + ") Out of bound");
				}
			}
			
			for (int i = 0; i < targets.size(); i++)
			{
				switch(action.toLowerCase()) {
					case "info":
						characters.get(targets.get(i)).getInfo();
						break;
					case "cook":
						characters.get(targets.get(i)).Cook();
						break;
					case "drive":
						characters.get(targets.get(i)).Drive();
						break;
					case "work":
						characters.get(targets.get(i)).Work();
						break;
					case "paint":
						characters.get(targets.get(i)).Paint();
						break;
				}
			}						
			
			if (action.equalsIgnoreCase("exit") ) break;
			
			System.out.println("\n\nPress any key to continue...");
			sc.nextLine();						
		}
		
		sc.close();
		System.out.println("\nThankyou");
		
		
	}

}
