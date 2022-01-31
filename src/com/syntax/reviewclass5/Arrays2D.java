package com.syntax.reviewclass5;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers=new int[2][3];
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[1][0]=40;
		numbers[1][1]=50;
		numbers[1][2]=60;
		
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		System.out.println("**********");
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				//System.out.println(i+" "+j);
			System.out.println(numbers[i][j]);
			}
		}
		
		
	}

}
