package fcu.iecs.oop.pokemon;

public class Pokemon {

	private int cp;
	private final String name;
	
	Pokemon(String na, int c){
		cp = c;
		name = na;
	}
	
	public String getName(){
		return name;
	}

	public int getCp(){
		return cp;
	}
	
	public void setCp(int c){
		cp = c;
	}
	
	
}
