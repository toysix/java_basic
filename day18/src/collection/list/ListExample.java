package collection.list;

import java.util.*;

public class ListExample {
	
	public static void main(String[] args) {
		
		// ArrayList 와 LinkedList 는 사용양식은 전부 List 를 따른다.
		// 따라서 교환이 가능하다. 인터페이스가 같은 구현체들은 사용법이 같다.
		// 제네릭 : 타입 안정화를 위해 객체 내부에 저장되는 타입을 일치시키는 방법
		// String만 저장할 수 있는 컬렉션
		
		List<String> list = new ArrayList<>(); // 1.8 부터는 생성자에 제네릭 표기 안해도 된다는거 같음
		// List<String> list = new LinkedList<>(); 링크드리스트로 해도 상관 없음
		
		String str1 = "java";
		String str2 = "SpringBoot";
		System.out.println(list);//컬렉션 특성상 toString()이 이미 재정의 되어 주소가 안나오고 내부 요소가 나옴
		
		// list에 객체를 저장하는 메서드 ㅁㅇㅇ() : 데이터를 마지막 지점에 추가
		
		list.add(str1);
		list.add(str2);
		list.add("Data Base");
		
		System.out.println(list);
		
		
		// list에 저장된 총 객체 수 얻기 size()
		int size = list.size();
		System.out.println(size);
		
		
		// list 에 객체 삽입 add(index, 객체) : 데이터를 해당 인덱스에 삽입
		list.add(2, "구우웃");
		System.out.println(list);
		
		//list 데이터 수정 set(index, 객체)
		//list[3] = "Postget"; // 일반 수정 구문 사용 불가
		list.set(3, "이걸로 바꼇당");
		System.out.println(list);
		
		
		//list 내부객체 가져오기 get(index)
		String s = list.get(2);
		System.out.println(s);
		
		//list 내부에 저장된 객체 인덱스번호 확인하기
		int idx = list.indexOf("java"); // 없는 자료 조회시 -1
		System.out.println(idx);
		
		
		//list 에서 객체데이터 삭제 remove(index), remove(객체)
		list.remove(2);
		System.out.println(list);
		list.remove("구우웃");
		System.out.println();
		
		
		//list 내부에 저장된 객체의 유무 확인 true / false
		System.out.println(list.contains("java"));
		
		//list 의 반복문 처리
		// 인덱스로 조회
		for(int i = 0; i < list.size(); i++) {
			System.out.println("내부요소 : "+list.get(i));
		}
		System.out.println("-----------------------");
		// 향상된 for 문도 사용 가능 (List<String> 으로 선언했으므로 String으로 받기
		for (String str : list) {
			System.out.println("soqndyth : " +str);
		}
		
		
		//ㅣlist 내부의 전체 자료 삭제 clear() --> 안 내용만 없애고 박스는 남김
		list.clear();
		System.out.println(list);
		
		//list 내부 데이터가 전부 비어 있는지 확인하는 메서드 isempty
		
		System.out.println(list.isEmpty());
		
	}

}
