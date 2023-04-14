package homework0407;

import java.util.ArrayList;

public class Sameple3_6 {

	
	public static void main(String[] args) {
		
	
		int[] odds23 = {1,3,5,7,9};
		
		String[] weeks23 = {"월","화","수","목","금","토","일"};
		
		System.out.println(weeks23[1]);
		
		for (int i = 0; i < weeks23.length; i++) {
			
			System.out.println(weeks23[i]);
		}
		
		String[] week23 = new String[7];
		
		week23[0] = "월";
		week23[1] = "화";
		week23[2] = "수";
		week23[3] = "목";
		week23[4] = "금";
		week23[5] = "토";
		week23[6] = "일";
		
		
		ArrayList pitches23 = new ArrayList();
		pitches23.add("123");
		pitches23.add("129");
		pitches23.add("142");
		
		pitches23.add(0, 199);
		
		System.out.println(pitches23.get(1));
		System.out.println(pitches23.size());
		
		System.out.println(pitches23.contains("129"));
		System.out.println(pitches23.remove("123"));
		System.out.println(pitches23.remove(2));
		System.out.println(pitches23.size());
		
		
		
		
	
		}
		
	}
	

	

