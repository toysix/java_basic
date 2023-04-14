package poly.noinheri;

import java.util.MissingFormatArgumentException;

public class MainClass3 {

	
	public static void main(String[] args) {
		
	
	Rat r1 = new Rat();
	Rat r2 = new Rat();
	
	Pig p1 = new Pig();
	Ghost g1 = new Ghost();
	
	
	Warrior a = new Warrior("도이치모터스");
	Magician m1 = new Magician("마법사다");
	
	
	a.showStatus();
	
	
	a.huntRat(r1);
	a.huntRat(r1);
	a.huntRat(r1);
	a.showStatus();
	
	
	m1.showStatus();
	m1.huntPig(p1);
	m1.huntGhost(g1);
	m1.showStatus();
	
	
	}
}
