package com.hardik.coreJava;

public class ArmStrong {

	public static void main(String[] args) {
		
		
		for(int i=100;i<=999;i++){
			
		
			//int i=153;
			int c = i % 10;
			int b = (i / 10)%10;
			int a = i / 100;
			int total =(int) (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
			
			//System.out.println(total+"a = "+a+" b = "+b+" c = "+c);
			if(total == i){
				System.out.println(total+" Number is ArmStrong");
			}
		
	}
		
		
		
	}
}
