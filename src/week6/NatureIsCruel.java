package week6;

public class NatureIsCruel {

	public static void main(String[] args) {

		Animal[] animal = new Animal[11];
		int i = 0;

		animal[0] = new Canary("Bluey", 10, 5, 1, 2);
		animal[1] = new Canary("Corina", 5, 4, 2, 1);
		animal[2] = new Canary("Joey", 2, 5, 3, 4);
		animal[3] = new NorwegianBlue("John Cleese", 2, 5, 4, 3);
		animal[4] = new NorwegianBlue("Michael Palin", 10, 5, 6, 5);
		animal[5] = new Pelican("Pelly", 0, 10, 14, 17);
		animal[6] = new Seagull("Gully", 0, 11, 12, 11);
		animal[7] = new Shark("Casper", 5, 19, 15);
		animal[8] = new GreatWhite("Shadow", 15, 20, 25);
		animal[9] = new Bluegill("Gilly", 15, 7, 7);
		animal[10] = new Tuna("Mack", 13, 14, 12);

		int rand = (int) (Math.random() * animal.length);
	    int rand1 = (int) (Math.random() * animal.length);

		while (i < animal.length - 1){
		    rand = (int) (Math.random() * animal.length);
		    rand1 = (int) (Math.random() * animal.length);
			int counter = i + 1;
			System.out.printf("********ROUND %d********\n", counter);
	     	System.out.println("Fight!");
			
			while (animal[rand1] == null || animal[rand] == null){
				if(animal[rand1] == null){
			    	rand1 = (int) (Math.random() * animal.length);
				} else{
			    	rand = (int) (Math.random() * animal.length);
				}
			}
			
		    if (animal[rand1] == animal[rand]) {
			    System.out.println("An animal can't eat itself.\n");
			    System.out.println("There was no winner this round.");
	     	} else if (animal[rand].eats(animal[rand1])){
			    System.out.println(animal[rand1] + " ate " + animal[rand] + ".\n");
			    System.out.println("The winner of this round is: " + animal[rand1]);
		    	animal[rand] = null;
		    	i += 1; 
	    	} else {
	    		System.out.println(animal[rand1] + " failed to eat " + animal[rand] + ".\n");
	    	}
		}
		System.out.println("********THERE IS A WINNER!!!********");
		System.out.println("The winner is: " + animal[rand1]);
	}
}
