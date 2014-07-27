package com.bloc.threads;



public class Main extends Object {

	public static void main(String [] args) {
		

		// Extract content beneath to ImageGetter
		new ImageGetter("http://www.fordesigner.com/imguploads/Image/cjbc/zcool/png20080526/1211782272.png", false).start();


		// ^^^ Extract the above to ImageGetter

		// This shouldn't exist yet, therefore we should be able to print 
		//if (exists == false) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/*   If you see this,   */");
			System.out.println("/*   congratulations!   */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/");	
		//}
	}
}
