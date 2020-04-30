
public class EggCarton {
	
	//class variables 
	public static int brownEggs = 0;
	public static int whiteEggs = 0;
	public static int total = 0;
	
	//constructor 
	public EggCarton() {
		brownEggs = 0;
		whiteEggs = 0;
		total = 0;
	}
	
	//checks if egg carton is full 
	public EggCarton(int brown, int white) {
		total = brown + white;  
		if (total > 12) {
			System.out.println("Maximum 12 eggs in a carton.");
		} else {
			brownEggs = brown;
			whiteEggs = white;
		}
	}
	
	//adds brown eggs to carton if there no more than 12 total eggs in carton 
	public boolean addBrownEggs(int brown) {
		if (brown + total > 12) {
			//System.out.println("Too many eggs in carton");
			return false; 
		} else {
			brownEggs += brown;
			total += brown;
			return true;
		}
	
		
	}
	//adds white eggs to carton if there is no more than 12 total eggs in carton 
	public boolean addWhiteEggs(int white) {
		if (white + total > 12) {
			//System.out.println("Too many eggs in carton");
			return false;
		} else {
			whiteEggs += white;
			total += white;
			return true;
		}
	}
	
	//returns total number of eggs in carton 
	public int getTotalEggs() {
		return total;
	}
	

}
