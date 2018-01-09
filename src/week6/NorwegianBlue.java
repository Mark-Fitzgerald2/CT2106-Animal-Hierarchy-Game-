package week6;

public final class NorwegianBlue extends Canary {

	/**
	 * constructor 1
	 */
	
	public NorwegianBlue(String name, int quality, int clr, int weight, int size) {
		super(name, quality, clr, weight, size);
		this.flies = false;
		this.moves = false;
		this.breathes = false;
		this.eats = false;
		this.sings = false;
		
	}
	
	
}
