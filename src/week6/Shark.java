package week6;

public class Shark extends Fish {

	protected boolean bites = true;
	protected int colour = 0;

	/**
	 * constructor 1
	 */

	public Shark(String name, int clr, int weight, int size) {
		this.colour = clr;
		this.name = name;
		this.weight = weight;
		this.size = size;
	}


	@Override
	public void move(int length) {
		swim(length);
	}

	@Override
	public void swim(int length) {
		System.out.println("I can swim " + length + " metres");
	}
}
