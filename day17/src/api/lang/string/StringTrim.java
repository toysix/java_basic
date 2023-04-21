package api.lang.string;

public class StringTrim {
	
	public static void main(String[] args) {
		
		// trim 은 좌측, 우측에서 다른 단어가 노오기 진전까지 공백을 전부 제거함
		
		String trimbefore = "                     옆이 거슬려유                ";
		System.err.println(trimbefore);
		String trimAfter = trimbefore.trim();
		System.out.println(trimAfter);
		
	}

}
