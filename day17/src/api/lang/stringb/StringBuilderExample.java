package api.lang.stringb;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		// StringBuffer 로 대체 가능
		// StringBuffer 는 쓰레드 안전을 보장한다. (자기가 소화가능한 데이터만 처리하고 그게 나가면 다시 또 채우고..??
		// 안전성을 보장하기 때문에 속도가 좀 느림
		// StingBuilder 는 쓰레드 안전을 보장하지 않음. (Buffer 보다 속도가 빠름)
		// 지역변수 내에서 생성했다가.. 어짜피 지워질꺼니까.. 지역내에서 선언해 쓸 때 위주로 많이 쓰임
		
		
		StringBuilder sb = new StringBuilder("JAVA");
		
		//문자열을 끝에 추가하는 메서드 appedn()
		
		sb.append(" Program Study");
		System.out.println(sb);
		
		//문자열을 특정 인덱스 위치에 삽입하는 메서드 insert()
		// 교체를 해주는게 아니고.. 밀어 놨다가 단어를 넣고 다시 땡기는 개념임
		
		sb.insert(12, "ming");
		System.out.println(sb);
		
		// 특정 인덱스 범위 문자열을 교체하는 메서드 replace()
		
		sb.replace(5, 16, "book"); // 5이상 16미만을 book 으로 교체해라
		System.out.println(sb);
		
		//문자열을 삭제하는 메서드 delete(begin, end)
		// JAVA Study
		
		
		sb.delete(4, 9);
		System.out.println(sb);
		
		
	}

}
