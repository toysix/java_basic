package final_.class_;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Person p1 = new Person("toysix");
		
		//p1.nationality = "일본" // final 이라 변경 불가
		//p1.name = "채자바";// final 이라 변경 불가
		
		p1.age = 25;
		
		System.out.println("국적 : "+ p1.natioality); //public이므로 조회 가능
		System.out.println("국적 : " + p1.name);//public이므로 조회 가능
		System.out.println("국적 : " + p1.age);//public이므로 조회 가능
		
		
		
	}

}
