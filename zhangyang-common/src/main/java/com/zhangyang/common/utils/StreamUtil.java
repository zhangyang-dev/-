package com.zhangyang.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class StreamUtil {
	
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable... ables){
		if(null != ables && ables.length>0) {
			for (AutoCloseable autoCloseable : ables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	//TODO 实现代码
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int x = 0;
		try {
//			-1表示读完 
			while((x = src.read(b)) != -1) {
				out.write(b);
			}
			return out.toString("utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//		关闭流
			closeAll(out,src);
			
		}
		return null;

		
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(txtFile);
			return readTextFile(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
