/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 


// MONA LISA
public class ASCIIArt {
	public static void main (String [] args) {
		text();
		//line 1
		System.out.print("\n \t  ");
		l();
		//line 2
		System.out.print("\n\t");
		eightPrinter(7);
		//line 3
		System.out.print("\n      ");
		eightPrinter(11);
		//line 4
		System.out.print("\n     ");
		eightPrinter(1);
		System.out.print("        ");
		eightPrinter(3);
		//line 5
		System.out.print("\n    ");
		eightPrinter(1);
		System.out.print("\t\t");
		eightPrinter(3);
		//line 6
		System.out.print("\n   ");
		eightPrinter(1);
		System.out.print(".-=. ,==-. ");
		eightPrinter(3);
		//line 7
		System.out.print("\n   ");
		eightPrinter(1);
		System.out.print(" `~`  `~'  ");
		eightPrinter(3);
		//line 8
		System.out.print("\n   ");
		eightPrinter(1);
		System.out.print("\t\t");
		eightPrinter(3);
		//line 9
		System.out.print("\n   ");
		eightPrinter(1);
		System.out.print("8  `-~  ' ");
		c();
		eightPrinter(3);
		//line 10
		System.out.print("\n   ");
		eightPrinter(3);
		System.out.print(" ~==~ . ");
		c();
		eightPrinter(3);
		//line 11
		System.out.print("\n   ");
		eightPrinter(17);
		//line 12 
		System.out.print("\n   ");
		eightPrinter(17);
		//line 13
		System.out.print("\n  8");
		eightPrinter(19);
		//line 14
		System.out.print("\n");
		l();
		l();
		l();
		l();
		l();
		l();
		
		
	}

	public static void l() {
		//lines
		System.out.print("____");
	}
	public static void eightPrinter(int numberOfEights) {
		//eight
		while(numberOfEights >= 0) {
			System.out.print("8");
			numberOfEights -= 1;
		}
		
	}
	public static void c() {
		//colon
		System.out.print(":");
	}
	public static void text() {
		//text from http://patorjk.com/software/taag/#p=display&f=Avatar&t=Mona%20Lisa%20
		
		System.out.println(" _      ____  _      ____    _     _  ____  ____   \r\n" + 
				"/ \\__/|/  _ \\/ \\  /|/  _ \\  / \\   / \\/ ___\\/  _ \\  \r\n" + 
				"| |\\/||| / \\|| |\\ ||| / \\|  | |   | ||    \\| / \\|  \r\n" + 
				"| |  ||| \\_/|| | \\||| |-||  | |_/\\| |\\___ || |-||  \r\n" + 
				"\\_/  \\|\\____/\\_/  \\|\\_/ \\|  \\____/\\_/\\____/\\_/ \\|  \r\n" + 
				"                                                   ");

	}	

}