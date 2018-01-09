package week6;

public class GreatWhite extends Shark {

	/**
	 * constructor 1
	 */

	public GreatWhite(String name, int quality, int weight, int size) {
		super(name, quality, weight, size);
		this.swims = false;
		this.moves = false;
		this.breathes = false;
		this.eats = false;
		this.bites = false;
		this.weight = weight;
		this.size = size;
	}

	@Override
	public void swim(int length) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean eats(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}
}
