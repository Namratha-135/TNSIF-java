package com.tnsif.ExceptionHandlingdemo;
import com.tnsif.scannerclassdemo.mainmethod;
public class Nestedtrycatch {

	public static void check() {
		String str1="TNS";
		
		int slength=str1.length();
		System.out.println("string length"+slength);
		
		String str2=null;
		int y=6;
		try {
			try {
				System.out.println(str1.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println("string length " +str2.length());
		}
		catch(NullPointerException d) {
		System.out.println(d.getMessage());
	}

}
public static void main(String[] args) {
	Nestedtrycatch.check();
}
}