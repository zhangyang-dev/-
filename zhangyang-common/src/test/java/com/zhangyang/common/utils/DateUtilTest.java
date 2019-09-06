package com.zhangyang.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2000, 1, 8);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(f.format(date));
		
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2018, 8, 8);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(dateFormat.format(date));
		
		
	}

}
