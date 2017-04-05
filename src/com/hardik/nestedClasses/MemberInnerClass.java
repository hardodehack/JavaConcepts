package com.hardik.nestedClasses;

/*
 * This is Example of Member Inner Class 
 * 
 * @author	Hardik Patel
 * @since	03-04-2017
 * 
 */


public class MemberInnerClass {
	
	private class InnerClass{
		void nonStatiMetho(){
			System.out.println("Non Static Method of inner Class");
		}
	}

	public static void main(String[] args) {

		MemberInnerClass ouObj = new MemberInnerClass();
		MemberInnerClass.InnerClass innObj = ouObj.new InnerClass(); // Please focus on only calling Inner Class Constructor.
		
		innObj.nonStatiMetho();
	}

}
