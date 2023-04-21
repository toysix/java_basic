package api.utill.calendar;

import java.util.*;

public class CalendarExample {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+ 1;
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		
		switch(week) {
		
		case Calendar.MONDAY: 	strWeek = "월"; break;
		case Calendar.TUESDAY: 	strWeek = "화"; break;
		case Calendar.WEDNESDAY: 	strWeek = "수"; break;
		case Calendar.THURSDAY: 	strWeek = "목"; break;
		case Calendar.FRIDAY: 	strWeek = "금"; break;
		case Calendar.SATURDAY: 	strWeek = "토"; break;
		case Calendar.SUNDAY: 	strWeek = "일"; break;
		
		default : strWeek = "일"; break;
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("오늘은 "+ year + "년 " + month + "월" + day + " 일 입니다.");
		System.out.println(hour + "시 "+ minute + "분"+ second + "초 " + strWeek + "요일 입니다.");
		
		}
		
		
		
	}


