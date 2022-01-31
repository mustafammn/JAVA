package com.syntax.class13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sharif";
		String name1="Mykl";
		/*System.out.println(name1.length());
		System.out.println(name.length());		
		
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		String str="This is easy 123456 ^%$&";
		System.out.println(str.toLowerCase());*/
		int number=10;
		//System.out.println(name+name1); // recommended to use always 
		System.out.println(name.concat(name1+" ").concat("   hk")+number); // not recommended to use 
		
		System.out.println(name+name1+number);
		//System.out.println(name.concat(name1).concat(number));
		
		
		
	}

}
