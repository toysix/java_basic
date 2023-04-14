package poly.instanceof_;

public class Cup {

	private String itemName; // 상품명
	private int price; // 가격
	private String companyName = "컵회사"; //제조사
	
	//위 자료들에 대해
	//String, int 파라미터를 입력받는 생성자를 만들어주세요.
	// 상품명, 가격은 입력된대로, 제조사는 "컵회사" 로 고정
	// 해서 대입해주세요.
	
	public Cup(String itemName, int price) {
	
		this.itemName = itemName;
		this.price = price;
		this.companyName = "컵회사";
		
}
	
	
	//void 파라미터로 생성자를 정의해주세요.
	//"입력안됨", 0, "컵회사"로 초기화합니다.
	
	public Cup() {
		
		this.itemName = "입력안됨";
		this.price = 0;
	    
	}
	
}