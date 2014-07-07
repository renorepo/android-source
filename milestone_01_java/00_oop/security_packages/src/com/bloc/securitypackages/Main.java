
package com.bloc.securitypackages;
// YOUR IMPORTS GO HERE
// import com.bloc.{your_package};

import com.bloc.securitypackages.colors.*;
import com.bloc.securitypackages.citrus.*;
import com.bloc.securitypackages.apples.*;

//com.bloc.securitypackages.colors.Orange orangeTheColor = new com.bloc.securitypackages.colors.Orange();
//com.bloc.securitypackages.citrus.Orange orangeTheCitrus = new com.bloc.securitypackages.citrus.Orange();



public class Main extends Object {

	public static void main(String [] args) {
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Macintosh();
		fruits[1] = new Green();
		fruits[2] = new Orange();
		fruits[3] = new Grapefruit();

		Color[] colors = new Color[5];
		colors[0] = fruits[0].getColor();
		colors[1] = fruits[1].getColor();
		colors[2] = fruits[2].getColor();
		colors[3] = fruits[3].getColor();
		colors[4] = new Orange();

		
		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
