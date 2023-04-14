package poly.static_.var;

public class Asean {
	
	// 실용영어  = 조별과제 시킴
	// 태국어 1명 - 마인어 3명
	// Asean 조
	// 출석 20 + 발표 30 + 기말 50
	private String name;
	private int attendanceScore; // 출결
	private int finalTermScore; // 기말
	
	// 종훈, 일윤, 은영, 제인
	public static int presentationScore; // 29 
	
	
	public Asean (String name,  int attendanceScore, int finalTermScore) {

		
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
		
		
}
	
	static {
		
		presentationScore = 29;
	}
	
	public void showStudentScore () {
		
		System.out.println("학생명 : "+ this.name);
		System.out.println("출석점수 : "+ this.attendanceScore);
		System.out.println("팀점수 :"+ presentationScore);
		System.out.println("기말점수 : "+ this.finalTermScore);
		System.out.println("최종성적 : "+ (attendanceScore)
								     + presentationScore
							     	 + finalTermScore);

		System.out.println("----------------------------");
	}
	
}
