package com.example.demoapplication;



import java.lang.reflect.Field;

import com.example.demo.annotation.MyColumn;
import com.example.demo.annotation.MyTable;
import com.example.demo.entity.Book;

public class Application {
	
	public static void main(String[] args) {
		Book book = new Book();
		MyTable table = book.getClass().getAnnotation(MyTable.class);
		Class<Book>bkclass=(Class<Book>)book.getClass();
		MyColumn columnOne=null;
		String dataType1="varchar";
	
		try {
			Field bookField;
			bookField = bkclass.getDeclaredField("bookNumber");
			Class type = bookField.getType();
			if(type.equals(Integer.class)) {
				dataType1="number";
			}
			columnOne = bookField.getAnnotation(MyColumn.class);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tableName = table.name();
		String col1=columnOne.name();
		String sql = "creat table"+tableName+"("+col1+" "+dataType1+")";
		System.out.println(sql);
	}

}
