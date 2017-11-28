import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		ArrayList<String> dwarves = new ArrayList<String>();
		
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("F�li");
		dwarves.add("K�li");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("�in");
		dwarves.add("Gl�in");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		System.out.println("Disney Dwarfs:");
		for (String dwarf: dwarfs)
		{
			System.out.println(dwarf);
		}
		
		System.out.println();
		System.out.println("Lord of the Rings Dwarves:");
		for (String dwarf: dwarves)
		{
			System.out.println(dwarf);
		}
	}

}
