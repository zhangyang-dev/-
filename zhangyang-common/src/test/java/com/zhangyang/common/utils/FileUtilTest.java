package com.zhangyang.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String str = "test.jsp";
		String string = FileUtil.getExtendName(str);
		System.out.println(string);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		 System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		fail("Not yet implemented");
	}

}
