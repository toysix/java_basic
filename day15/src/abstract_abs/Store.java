package abstract_abs;

public class Store extends PopupStore{

	@Override
	public void orderApple() {
		System.out.println("착즙 사과주스는 20원입니다.");
		
	}

	@Override
	public void orderOrange() {
		System.out.println("오렌지 착즙은 니가 알아서 해드세요");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("포도 착즙은 200원입니다.");
		
	}
	
}
