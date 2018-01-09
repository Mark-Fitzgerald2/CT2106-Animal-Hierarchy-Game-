package week6;

public abstract class Fish extends Animal {

	protected boolean fins = true;
	protected boolean swims = true;
	protected boolean gills = true;

	public abstract void swim(int length);
	

	@Override
	public boolean eats(Animal animal) {
		if  (this.weight > (animal.weight) && this.size > (animal.size)){ 
			return false;
		} else if (this.weight == (animal.weight) && this.size == (animal.size)){
		    return false;
		} else {
			return true;
		}
	}
}