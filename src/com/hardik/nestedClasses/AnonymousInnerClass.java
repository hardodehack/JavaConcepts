package com.hardik.nestedClasses;

import com.hardik.nestedClasses.Test3.SayHelloI;

/*
 *	This is the example of AnonymousInnerClass.
 * 
 * @author	Hardik Patel
 * @since	04-04-2017
 * 
 */

class Test3{
	interface SayHelloI{
		void sayHello();
	}	//	End of Interface
} 	//	End of Class

public class AnonymousInnerClass {
	
	public void sayHello(){
		
		
		//
		class EnglishHelloImpl implements SayHelloI{
			public void sayHello(){
				System.out.println("Hello in English....");
			}
		}	//	End of EnglishSayHello Class.......

		SayHelloI english = new EnglishHelloImpl();
		
		SayHelloI french = new SayHelloI() {
			public void sayHello() {
				System.out.println("Helo Craze...");
			}
		};
		
		SayHelloI greek = new SayHelloI() {
			public void sayHello() {
				System.out.println("Capre Diem....");
			}
		};
		
		english.sayHello();
		french.sayHello();
		greek.sayHello();
		
	}	//	End of sayHello Method.............

	public static void main(String[] args) {

		AnonymousInnerClass t1Obj = new AnonymousInnerClass();
		t1Obj.sayHello();
		
	}	//	End of Main Method............

}	//End of Main Class
