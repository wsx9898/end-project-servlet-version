package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TestTime {
	public static void main(String[] args) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

//		System.out.println(sFormat);
//		System.out.println();
		System.out.println(Calendar.getInstance().getTime());

//		java.util.Date createDate = null;
//		try {
//			createDate = sFormat.parse(timeStamp);
//			System.out.println(createDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e);
//		}
	}
}
