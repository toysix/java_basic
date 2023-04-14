package example_this_.car;

public class HumanMain {
	
	public static void main(String[] args) {
		
		Human1 kim = new Human1("김철수", 20);
		
		kim.showInfo();
		
		Human1 park = new Human1("박연희");
		
		park.showInfo();
		
		Human1 noname = new Human1();
		
		noname.showInfo();
		
		
		
	}

}
