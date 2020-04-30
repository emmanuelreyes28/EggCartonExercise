
public class EggCartonTester {
	public static void main(String args[]) {
		EggCarton test = new EggCarton(10,2);
		System.out.print("Total eggs in carton: ");
		System.out.println(test.getTotalEggs());
		System.out.println("10 brown eggs.");
		System.out.println("2 white eggs.");
		//System.out.println(test.getTotalEggs());
		//System.out.println(test.brownEggs);
		//System.out.println(test.whiteEggs);
		System.out.println("");
		System.out.print("Add 3 brown eggs.");
		System.out.println("");
		System.out.println(test.addBrownEggs(3));
		System.out.println("");
		//System.out.println(test.getTotalEggs());
		System.out.println("Add 0 white eggs.");
		System.out.println(test.addWhiteEggs(0));
		System.out.println("");
		System.out.print("Total eggs in carton: ");
		System.out.println(test.getTotalEggs());
		
		System.out.println("---------------------------------------------------");
		
		EggCarton test2 = new EggCarton(1,6);
		System.out.print("Total eggs in carton: ");
		System.out.println(test2.getTotalEggs());
		System.out.println("1 brown eggs.");
		System.out.println("6 white eggs.");
		System.out.println("");
		System.out.print("Add 1 brown egg.");
		System.out.println("");
		System.out.println(test2.addBrownEggs(1));
		System.out.println("");
		System.out.println("Add 3 white eggs.");
		System.out.println(test2.addWhiteEggs(3));
		System.out.println("");
		System.out.print("Total eggs in carton: ");
		System.out.println(test2.getTotalEggs());
		
		System.out.println("---------------------------------------------------");

		EggCarton test3 = new EggCarton(0,0);
		System.out.print("Total eggs in carton: ");
		System.out.println(test3.getTotalEggs());
		System.out.println("0 brown eggs.");
		System.out.println("0 white eggs.");
		System.out.println("");
		System.out.print("Add 2 brown eggs.");
		System.out.println("");
		System.out.println(test3.addBrownEggs(2));
		System.out.println("");
		System.out.println("Add 2 white eggs.");
		System.out.println(test3.addWhiteEggs(2));
		System.out.println("");
		System.out.print("Total eggs in carton: ");
		System.out.println(test3.getTotalEggs());
		
		System.out.println("---------------------------------------------------");

		EggCarton test4 = new EggCarton(12,0);
		System.out.print("Total eggs in carton: ");
		System.out.println(test4.getTotalEggs());
		System.out.println("12 brown eggs.");
		System.out.println("0 white eggs.");
		System.out.println("");
		System.out.print("Add 3 brown eggs.");
		System.out.println("");
		System.out.println(test4.addBrownEggs(3));
		System.out.println("");
		System.out.println("Add 1 white egg.");
		System.out.println(test4.addWhiteEggs(1));
		System.out.println("");
		System.out.print("Total eggs in carton: ");
		System.out.println(test4.getTotalEggs());
		
		System.out.println("---------------------------------------------------");

		EggCarton test5 = new EggCarton(1,7);
		System.out.print("Total eggs in carton: ");
		System.out.println(test5.getTotalEggs());
		System.out.println("1 brown eggs.");
		System.out.println("7 white eggs.");
		System.out.println("");
		System.out.print("Add 5 brown eggs.");
		System.out.println("");
		System.out.println(test5.addBrownEggs(5));
		System.out.println("");
		System.out.println("Add 6 white eggs.");
		System.out.println(test5.addWhiteEggs(6));
		System.out.println("");
		System.out.print("Total eggs in carton: ");
		System.out.println(test5.getTotalEggs());
		
	}


}
