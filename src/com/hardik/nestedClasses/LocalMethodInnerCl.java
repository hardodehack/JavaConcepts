package com.hardik.nestedClasses;


/*
 * This is the Example of Local Inner Class (Method Inner Class)
 * 
 * @author 	Hardik Patel
 * @since	03-04-2017
 * 
 */

public class LocalMethodInnerCl {

	private static void localMethod(){			//	It can be Static or Non Static Anything Possible......
		
		class LocalInnerCl{				// Only default AS is allowed here.....

			String bla = "Aise hi....";	//From JDK 1.8 only we can define Non-Final Members.
			private void disp1(){
				System.out.println("Invoking LocalInnerClass Method......");
			}
		}	//	End of Local Inner Class
		//	We have to instanstiate Local Inner Class in Method Only........
		LocalInnerCl innObj = new LocalInnerCl();
		innObj.disp1();
	}	// 	End of Method
	
	public static void main(String[] args) {
		LocalMethodInnerCl.localMethod();
	}	//	End of Main Method.

}	//	End of Class
