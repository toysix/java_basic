package day08;

public class BasketbalPlayerMain {

	public static void main(String[] args) {
		
			BasketbalPlayer b1 = new BasketbalPlayer("조던", 185, 30, 300000);
					
			BasketbalPlayer b2 = new BasketbalPlayer("마이클", 285, 230, 2300000);
		
		
		//b1.name = "조던";
		//b1.height = 185;
		//b1.age = 30;
		//b1.salary = 300000;
		
		//b2.name = "마이클";
		//b2.height = 285;
		//b2.age = 230;
		//b2.salary = 2300000;
		
		b1.showInfo();
		b1.dunkShoot();
		
		b2.showInfo();
		b2.dunkShoot();
		
		
	}
	
}