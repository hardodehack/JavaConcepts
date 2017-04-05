package com.hardik.nestedClasses;

/*
 * This is Example of Nested Static Inner Class 
 * 
 * @author	Hardik Patel
 * @since	03-04-2017
 * 
 */

public class StaticNestedClassExmp {
	
	static class NestedStaticInClass{
		// Declaring NonStatic method in Static inner Class
		private void nonStaticMeInn(){
			System.out.println("Accessing Nested NonStatic StaticClass Method... ");
		} 
		private static void nesInMethod(){
			System.out.println("Accessing Nested Static Class Method... ");
		}
	}
	
	public static void main(String[] args) {
		//Directly accessing static member of static inner Class
		StaticNestedClassExmp.NestedStaticInClass.nesInMethod();
		
		// To invoke NonStatic Member of Static Inner Class
		StaticNestedClassExmp.NestedStaticInClass objO = new StaticNestedClassExmp.NestedStaticInClass();
		objO.nonStaticMeInn();
	}
}
