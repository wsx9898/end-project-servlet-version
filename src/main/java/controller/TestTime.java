package controller;

import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class TestTime {
	public static void main(String[] args) {
		LinkedList<String> qtyList = new LinkedList<String>();
		qtyList.add("123");
		qtyList.add("456");
		System.out.println(qtyList);


		HashMap qtyMap = new HashMap();
		qtyMap.put("qty1",66666);
		qtyMap.put("id",1);
		System.out.println(qtyMap);

		System.out.println("-------");
		System.out.println(new JSONObject(qtyMap));
	}
}
