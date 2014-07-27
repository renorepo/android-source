package com.bloc.threads;
import java.util.Scanner;



public class Main extends Object {
	private static Boolean viewImage() {
		Boolean answer = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to view the image y/n?");
		String view = sc.next();
		System.out.println(view.getClass().getName());
		if(view.equals("y")){
				answer = true;
			} else if(view.equals("n")) {
				answer = false;
			} else {
				System.out.println("Please choose 'y' or 'n'");
				viewImage();
			}
		return answer;
		}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL for your image:");
		String url = sc.next();
		Boolean launch = viewImage();
		

		

		// Extract content beneath to ImageGetter
		new ImageGetter(url, launch).start();


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
