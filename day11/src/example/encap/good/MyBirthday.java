package example.encap.good;

public class MyBirthday {
	
	/*
	 * 은닉 (캡슐화) 시 변수는 무조건 private 으로 처리
	 * 
	 */
	
	private int year;
	private int month;
	private int day;
	
	
	public MyBirthday(int year, int month, int day) {
		
		super();
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	void showDataInfo() {
		System.out.println("내 생일은");
		System.out.println(year + " 년");
		System.out.println(month + " 월");
		System.out.println(day + " 일");
		
	}
	
	
	/*
	 * 은닉된 변수에 접근하기 위해서는
	 * 클래스 설계시 미리 설정해둔 setter /getter 메서드를
	 * 이용해 데이터에 접근 해야 한다.
	 * 
	 * 
	 * 
	 * -setter 메서드 선언.
	 * 1. setter 메서드는 은닉변수에 값을 저장(세팅)하기 위해 선언한다.
	 * 2. 메서드의 접근제한자는 public 으로 설정하고
	 *     이름은 일반적으로 set + 변수명으로 지정한다.
	 */
	
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			
			day = 1; // 잘못 들어온 수에 대한 처리는 
		} else {
			
			this.day = day;
		}
	}
	
	
	/*
	 * -getter 메서드 선언.
	 * 1. getter 메서드는 말 그대로 수를 get 하는 용도이다.
	 * 2. 값을 초회만 할 수 있고 변경은 불가능 하기 때문에 직접조회보다 보안성을 높여준다.
	 * 3. 이름은 마찬가지로 get + 변수명을 사용해 만든다.
	 */
	
	public int getDay() {
		
		return this.day;
	}
	
	
	// year, month 에 대해서도 여러분들이 setter/getter 를 모두 만들어주세요. year 는 음수값 안들가게..?

	
	public void setYear(int year) {
		
		if (year > 0) {
			
			this.year = year;
			
		}else {
			
			System.out.println("년도를 잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
	}
	
	
	public int getYear() {
		
		return this.year;
		
	}
	
	public void setMonth(int month) {
		
		if (month >0 || month <13) {
			
			this.month = month;
			
		} else {
			
			System.out.println("1~12월 사이의 숫자를 입력해주세요.");
		}
		
	}
	
	public int getMonth() {
		
		return this.month;
		
	}

	
}
