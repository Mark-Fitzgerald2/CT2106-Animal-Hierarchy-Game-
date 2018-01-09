package week6;

public abstract class Bird extends Animal {

	protected boolean wings = true;
	protected boolean flies = true;
	protected boolean feathers = true;

	public abstract void fly(int length);
	
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
