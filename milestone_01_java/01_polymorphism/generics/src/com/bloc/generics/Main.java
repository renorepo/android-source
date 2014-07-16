package com.bloc.generics;

import com.bloc.generics.things.*;

class RandomThing {
	@Override
	public String toString() {
		return "A THREE FOOT BLACK ROD WITH A RUSTY STAR";
	}

}

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		/*
		 * Put a bunch of Toys in toyBox!
		 */
		RandomThing someThing = new RandomThing();
		Toy giJoe = new Toy<String>("GI Joe");
		Toy heMan = new Toy<String>("He-Man");
		Toy mask = new Toy<String>("Mu Mu Mu Mask");
		Toy junk = new Toy<RandomThing>(someThing);
		toyBox.addToy(giJoe);
		toyBox.addToy(heMan);
		toyBox.addToy(mask);
		toyBox.addToy(junk);
		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

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
