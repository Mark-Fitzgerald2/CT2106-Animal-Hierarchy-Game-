package week6;

public class Pelican extends Bird{

	protected boolean sings = false;
	protected int colour = 0;
	protected int songQuality = 0;

	/**
	 * constructor 1
	 */

	public Pelican(String name, int quality, int clr, int weight, int size) {
		this.colour = clr;
		this.songQuality = quality;
		this.name = name;
		this.weight = weight;
		this.size = size;
	}


	@Override
	public void move(int length) {
		fly(length);
	}

	@Override
	public void fly(int length) {
		System.out.println("I can fly " + length + " metres");
	}
}
