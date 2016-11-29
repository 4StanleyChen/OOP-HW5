package fcu.iecs.oop.pokemon;
import java.util.Random; 

public class GYM {
	
	public static void fight(Pokemon p1, Pokemon p2){
		Random rd = new Random();
		
		int winner = rd.nextInt(2)+1;
		
		switch(winner){
		case 1:
			System.out.println("Winner is " + p1.getName() + "." );
			p1.setCp(p1.getCp()+500);		
			break;
		case 2:
			System.out.println("Winner is " + p2.getName() + "." );
			p2.setCp(p2.getCp()+500);	
			break;
		}
	}

	

}
