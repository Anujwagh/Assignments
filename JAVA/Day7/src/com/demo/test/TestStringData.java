package com.demo.test;

public class TestStringData {

	public static void main(String[] args) {
		String s1 = "TestString Data";
		String s2 = "TestStringData";
		String s3 = s2;
		String s4 = new String("TestStringData");
		
		System.out.println("s1==s2:" + (s1==s2));
		System.out.println("s2==s3:" + (s2==s3));
		System.out.println("s2==s4:" + (s2==s4));

		System.out.println("using equals(ob):" + (s2.equals(s4)) );
		
		System.out.println("using index(str):" + s1.indexOf("Data"));
		System.out.println("using toLowerCase():" + s1.toLowerCase());
		System.out.println("using toUpperCase():" + s1.toUpperCase());
		System.out.println("using contains():" + s1.contains("Data"));

		String s5="xxx,yyy,zzz-rrrr";
		String[] arr=s5.split(",");
		String str=String.join(":",arr);
		System.out.println(str);


		

	}

}
