package week6;

public abstract class Animal {
	
	private boolean hasSkin = true;
	protected boolean moves = true;
	protected boolean eats = true;
	protected boolean breathes = true;
	protected int weight;
	protected int size;
	protected String name = "";
	
	public abstract void move(int length);

	public boolean isHasSkin() {
		return hasSkin;
	}

	public void setHasSkin(boolean hasSkin) {
		this.hasSkin = hasSkin;
	}

	public abstract boolean eats(Animal animal);
	
	public String toString() {
		return name;
	}
}
